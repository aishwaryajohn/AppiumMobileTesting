package Appium;


import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.bytebuddy.asm.Advice.Enter;
public class Demo2 extends Appium {
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest()
	public void bt() throws MalformedURLException {
		driver=capability();
	}
	@Test()
	public void testcase1() throws InterruptedException {
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("moolya");
		//driver.getKeyboard().pressKey(Keys.ENTER);       // alternative way
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		//act.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
WebElement	element=	driver.findElement(By.xpath("//*[contains(text(),'Moolya | LinkedIn')]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementsByClassName('cz3goc BmP5tf')[1].scrollIntoView()");
	js.executeScript("arguments[0].scrollIntoView()",element);	
	Thread.sleep(3000);
	element.click();
		driver.findElement(By.xpath("//*[contains(text(),'Moolya | LinkedIn')]")).click();
		Thread.sleep(3000);
		//driver.close();
	}
}


