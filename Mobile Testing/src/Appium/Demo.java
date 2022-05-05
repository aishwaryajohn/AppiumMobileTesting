package Appium;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo extends Appium {
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

	
	}


