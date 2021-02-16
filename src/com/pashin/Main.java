package com.pashin;

public class Main {

    public static void main(String[] args) {
        ConfigLogger configLogger = ConfigLogger.getInstance();
        configLogger.logProperties();
    }
}
