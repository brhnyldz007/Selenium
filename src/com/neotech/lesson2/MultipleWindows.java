package com.neotech.lesson2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass5;

public class MultipleWindows  extends BaseClass5 {
//	==================  HW_1_Handling Multiple Windows =======================
//
//			1) Launch the browser and open the site " http://demo.guru99.com/popup.php "
//			2) Click on link "Click Here ".When the user clicks on the " Click Here " link, new child window opens.
//			3)On the Child Window, Enter your email ID and submit.
//			4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//			5) Close the Child window on which credentials are displayed.Switch to the parent window.
//			6) Quit all browsers
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		System.out.println("Title -> " + driver.getTitle());

		// This will give the unique Id of the window
		System.out.println("Handle -> " + driver.getWindowHandle());

		driver.findElement(By.linkText("Click Here")).click();

		Thread.sleep(3000);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("The number of open windows/tabs is -> " + allWindowHandles.size());
		
		Iterator<String> it = allWindowHandles.iterator();
		String window1 = it.next();
		String window2 = it.next();

		System.out.println("window1 -> " + window1);
		System.out.println("window2 -> " + window2);
		
		driver.switchTo().window(window2);
		
		WebElement str = driver.findElement(By.cssSelector("input[name='emailid']"));
		str.sendKeys("adf@gmail.com");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(window1);
		Thread.sleep(3000);
		
	
		tearDown();
		
	}

}
