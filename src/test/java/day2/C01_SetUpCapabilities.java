package day2;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class C01_SetUpCapabilities {

    // Setup Appium Environments
    // 1 st step : Create androidDriver from the AndroidDriver class

    AndroidDriver<AndroidElement> androidDriver;

    // 2nd step :Create capabilities object from the DesiredCapabilities class

    DesiredCapabilities capabilities = new DesiredCapabilities();

    //    note: why do we need to use capabilities?
    //    1- we should define name of the emulator operating system url automation name , app name
    //    2- Capabilities are working as a key value

    @Test
    public void setUpCalculator() throws MalformedURLException {
        capabilities.setCapability("deviceName","Pixel 2 API 30"); // the name of device
        capabilities.setCapability("platformName", "Android");// the name of the system
        capabilities.setCapability("platformVersion","11.0");// version no
        capabilities.setCapability("automationName","UiAutomator2");
        // Download an application from the apkPure
        // create a directory with name app under the project name then drag and drop the downloaded app
        capabilities.setCapability("app",System.getProperty("user.dir")+"/app/Calculator.apk");
        // Set-up the driver and define url
        androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723"),capabilities) ;
    }
}
