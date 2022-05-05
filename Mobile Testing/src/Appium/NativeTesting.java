package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
public class NativeTesting {
	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cp = new DesiredCapabilities();
		
		cp.setCapability(MobileCapabilityType.DEVICE_NAME, "John");
		cp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//this for native app
		cp.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cp.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		
		//By default it will take the device as android therefore if we are using IOS(IPHONE) we have to mandatorily give the automation
		//name(the below command) .I have commented this line as I'm using Andriod as of now
		//cp.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		
		//For andriod, the automation name is not madatory but I have given those lines of code below
		
		cp.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		
		
		//This is used for default,
		cp.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
		
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cp);
        return driver;
	}
}



	


