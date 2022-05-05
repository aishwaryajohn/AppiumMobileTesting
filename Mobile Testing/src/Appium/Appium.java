package Appium;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
public class Appium {
	public static String URL = "https://www.google.com";
	public static AndroidDriver<AndroidElement> capability()  throws MalformedURLException {
	
		// TODO Auto-generated method stub
		DesiredCapabilities cp = new DesiredCapabilities();
		// this two are common
		// it
		cp.setCapability(MobileCapabilityType.DEVICE_NAME, "John");
		cp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		// i wnt to test webapp
		cp.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//i am testing a browser provide chrome driver
		cp.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C://Selenium//chromedriver.exe");
		cp.setCapability("ignoreHiddenApiPolicyError",true);
		// i want to run this device on emulator that is here we are creating an android driver instance by hitting the url usinf ip address
		//of the hub of the appium which is similar to webdriver which we used for selenium
		///0.0.0.0:4723--> Ip and port number in appium
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cp);
		return driver;
	}
}

