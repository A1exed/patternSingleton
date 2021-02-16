package com.pashin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLogger {
    private static ConfigLogger configLogger;
    private static Properties properties;

    private ConfigLogger() {
        try {
            properties = new Properties();
            properties.load(new FileInputStream("src/resources/config.properties"));
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static ConfigLogger getInstance() {
        if (configLogger == null) {
            configLogger = new ConfigLogger();
        }
        return configLogger;
    }

    public void logProperties() {
        for (String prop: properties.stringPropertyNames()) {
            System.out.println(prop + "=" + properties.getProperty(prop));
        }
    }
}
