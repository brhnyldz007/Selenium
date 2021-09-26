package com.neotech.lesson3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass5;

public class HomeWork1 extends BaseClass5 {
//	    Verify element is enabled
//       Open chrome browser
//       Go to “https://the-internet.herokuapp.com/”
//       Click on “Click on the “Dynamic Controls” link
//       Click on enable button
//       Enter “Hello” and verify text is entered successfully
//       Close the browser 
	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[href='/dynamic_controls']")).click();

		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		WebDriverWait enableWait = new WebDriverWait(driver, 15);
		enableWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"input-example\"]/button")));

		
		driver.findElement(By.xpath("//form[@id='input-example']/input")).sendKeys("Hello!");

		Thread.sleep(2000);
		
		tearDown();
		
	}

}
