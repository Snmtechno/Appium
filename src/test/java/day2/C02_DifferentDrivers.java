package day2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class C02_DifferentDrivers {

AppiumDriver<MobileElement> appiumDriver;
DesiredCapabilities capabilities = new DesiredCapabilities();

@Test
    public void isCalculatorAppInstalled() throws MalformedURLException {
    capabilities.setCapability("deviceName","Pixel 2 API 30"); // the name of device
    capabilities.setCapability("platformName", "Android");// the name of the system
    capabilities.setCapability("platformVersion","11.0");// version no
    capabilities.setCapability("automationName","UiAutomator2");
    // Download an application from the apkPure
    // create a directory with name app under the project name then drag and drop the downloaded app
    capabilities.setCapability("app",System.getProperty("user.dir")+"/app/Calculator.apk");
    // Setup the driver and define url
    appiumDriver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723"),capabilities) ;
    Assert.assertTrue(appiumDriver.isAppInstalled("com.google.android.calculator"));

}

@Test
    public void capabilityTypes() throws MalformedURLException {
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2 API 30"); // the name of device
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");// the name of the system
    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");// version no
    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
    // Download an application from the apkPure
    // create a directory with name app under the project name then drag and drop the downloaded app
    capabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/app/Calculator.apk");
    // Setup the driver and define url
    appiumDriver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723"),capabilities) ;


}
}
