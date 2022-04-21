package config;

import org.aeonbits.owner.ConfigFactory;

public class Project {

    public static ProjectConfig configStack = ConfigFactory.create(ProjectConfig.class, System.getProperties());

    public static String getUserName() {
        return configStack.username();
    }

    public static String getPassword() {
        return configStack.password();
    }

    public static String getApp() {
        return configStack.identificateapp();
    }

    public static String url() {
        return configStack.url();
    }
}
