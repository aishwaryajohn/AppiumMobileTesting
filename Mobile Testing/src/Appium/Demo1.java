package Appium;


	import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;

	public class Demo1 extends Appium {
		AndroidDriver<AndroidElement> driver;
		@BeforeTest
		public void BT() throws MalformedURLException{
			
			 driver = capability();

		}
		
		@Test
		public void testcase1()
		{
			driver.get("http://www.google.com");
			String Title = driver.getTitle();
			System.out.println(Title);
		}
		
		@Test
		public void testcase2() throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Moolya");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("return document.getElementById('kp-wp-tab-overview')");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			js.executeScript("return document.getElementByClassName('yuRUbf').click()");
			//js.executeScript("document.getElementByClassName('q8U8x MBeuO ynAwRc oewGkc LeUQr')[3].scrollIntoView()");
		
		}}


