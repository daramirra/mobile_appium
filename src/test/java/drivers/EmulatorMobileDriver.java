package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.Project;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class EmulatorMobileDriver implements WebDriverProvider {
    public static URL getAppiumUrl() {
        try {
            return new URL(Project.emulatorConfig.appiumUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        desiredCapabilities.setCapability("platformName", Project.emulatorConfig.platformName());
        desiredCapabilities.setCapability("deviceName", Project.emulatorConfig.deviceName());
        desiredCapabilities.setCapability("version", Project.emulatorConfig.version());
        desiredCapabilities.setCapability("locale", Project.emulatorConfig.locale());
        desiredCapabilities.setCapability("language", Project.emulatorConfig.language());
        desiredCapabilities.setCapability("appPackage", Project.emulatorConfig.appPackage());
        desiredCapabilities.setCapability("appActivity", Project.emulatorConfig.appActivity());
        desiredCapabilities.setCapability("app", Project.emulatorConfig.appUrl());

        return new AndroidDriver(getAppiumUrl(), desiredCapabilities);
    }
}