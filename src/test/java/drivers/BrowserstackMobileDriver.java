package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.Project;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {
    public static URL getBrowserstackUrl() {
        try {
            return new URL(Project.browserstackConfig.browserstackUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        desiredCapabilities.setCapability("browserstack.user", Project.browserstackConfig.browserstackUser());
        desiredCapabilities.setCapability("browserstack.key", Project.browserstackConfig.browserstackKey());
        desiredCapabilities.setCapability("app", Project.browserstackConfig.appUrl());
        desiredCapabilities.setCapability("device", Project.browserstackConfig.device());
        desiredCapabilities.setCapability("os_version", Project.browserstackConfig.osVersion());
        desiredCapabilities.setCapability("project", Project.browserstackConfig.project());
        desiredCapabilities.setCapability("build", Project.browserstackConfig.build());
        desiredCapabilities.setCapability("name", Project.browserstackConfig.name());

        return new AndroidDriver(getBrowserstackUrl(), desiredCapabilities);
    }
}