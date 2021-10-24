package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.Project;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SelenoidMobileDriver implements WebDriverProvider {
    public static URL getSelenoidUrl() {
        try {
            return new URL(Project.selenoidConfig.selenoidUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        desiredCapabilities.setCapability("platformName", Project.selenoidConfig.platformName());
        desiredCapabilities.setCapability("deviceName", Project.selenoidConfig.deviceName());
        desiredCapabilities.setCapability("version", Project.selenoidConfig.version());
        desiredCapabilities.setCapability("locale", Project.selenoidConfig.locale());
        desiredCapabilities.setCapability("language", Project.selenoidConfig.language());
        desiredCapabilities.setCapability("enableVNC", true);
        desiredCapabilities.setCapability("enableVideo", true);
        desiredCapabilities.setCapability("appPackage", Project.selenoidConfig.appPackage());
        desiredCapabilities.setCapability("appActivity", Project.selenoidConfig.appActivity());
        desiredCapabilities.setCapability("app", Project.selenoidConfig.appUrl());

        return new AndroidDriver(getSelenoidUrl(), desiredCapabilities);
    }
}