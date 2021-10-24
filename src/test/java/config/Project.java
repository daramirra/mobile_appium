package config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static BrowserstackConfig browserstackConfig = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());
    public static SelenoidConfig selenoidConfig = ConfigFactory.create(SelenoidConfig.class, System.getProperties());
    public static EmulatorConfig emulatorConfig = ConfigFactory.create(EmulatorConfig.class, System.getProperties());
    public static RealDeviceConfig realDeviceConfig = ConfigFactory.create(RealDeviceConfig.class, System.getProperties());
}