package com.neotech.lesson3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass5;

public class HandlingFrames extends BaseClass5 {
	
	public static void main(String[] args) throws InterruptedException {
		// HW for middle-class student :)
		// Go to https://the-internet.herokuapp.com/nested_frames
		// Go to the frame with name frameset-middle
		// Go to the frame with index 1
		// Check the that text of the body is MIDDLE
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
	
		WebElement str = driver.findElement(By.xpath("/html/body/div"));
		System.out.println(str.getText());
		
		
		
		
		Thread.sleep(2000);
		
		
		
		tearDown();
	}

}
