package tests;

import com.codeborne.selenide.Configuration;
import drivers.BrowserstackMobileDriver;
import drivers.EmulatorMobileDriver;
import drivers.RealDeviceMobileDriver;
import drivers.SelenoidMobileDriver;
import helpers.BrowserstackVideoUrlBuilder;
import helpers.SelenoidVideoUrlBuilder;
import helpers.VideoUrlBuilder;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.Attach.*;

public class TestBase {
    private static VideoUrlBuilder videoUrlBuilder;

    @BeforeAll
    public static void setup() throws MalformedURLException {
        addListener("AllureSelenide", new AllureSelenide());

        String deviceHost = System.getProperty("deviceHost");
        switch (deviceHost) {
            case "browserstack":
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                videoUrlBuilder = new BrowserstackVideoUrlBuilder();
                break;
            case "selenoid":
                Configuration.browser = SelenoidMobileDriver.class.getName();
                videoUrlBuilder = new SelenoidVideoUrlBuilder();
                break;
            case "emulation":
                Configuration.browser = EmulatorMobileDriver.class.getName();
                break;
            case "real":
                Configuration.browser = RealDeviceMobileDriver.class.getName();
                break;
            default:
                throw new IllegalArgumentException("Unknown deviceHost=" + deviceHost +
                        ". Please run with parameter -DdeviceHost=[browserstack/selenoid/emulation/real]");
        }

        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    public void startDriver() {
        open();
    }

    @AfterEach
    public void afterEach() {
        if (videoUrlBuilder != null) {
            attachVideo(videoUrlBuilder.buildVideoUrl(getSessionId()));
        }

        screenshotAs("Last screenshot");
        pageSource();
        closeWebDriver();
    }
}