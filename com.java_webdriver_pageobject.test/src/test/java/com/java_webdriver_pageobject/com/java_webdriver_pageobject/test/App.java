package com.java_webdriver_pageobject.com.java_webdriver_pageobject.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class App {
    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        Result result = jUnitCore.run(HomePageTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
