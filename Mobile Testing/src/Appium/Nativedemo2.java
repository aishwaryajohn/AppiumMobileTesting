package Appium;


	import java.net.MalformedURLException;
	import java.net.URL;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.AndroidMobileCapabilityType;
	import io.appium.java_client.remote.AutomationName;
	import io.appium.java_client.remote.MobileCapabilityType;
	public class Nativedemo2 {

		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			 AndroidDriver<AndroidElement> capability();
		
		driver.findElementByAccessibilityId("OS").click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("SMS Messaging").click();
		Thread.sleep(2000);
		driver.findElement(By.id("io.appium.android.apis:id/sms_recipient")).sendKeys("(555) 521-5554");
		
		driver.findElement(By.id("io.appium.android.apis:id/sms_content")).sendKeys("OTP:One Time Password");
		
		driver.findElementByAccessibilityId("Send").click();
		 Thread.sleep(3000);
		
		 driver.findElement(By.id("android:id/button2")).click();
		 Thread.sleep(2000);
		
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		Thread.sleep(2000);
		
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		Thread.sleep(3000);
				
		String message = driver.findElement(By.id("com.google.android.apps.messaging:id/conversation_snippet")).getText().split(":")[1].trim();
		System.out.println(message);
	

	}

}
