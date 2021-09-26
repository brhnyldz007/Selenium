package com.neotech.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass5;

public class HandlingFrames extends BaseClass5{
	
	public static void main(String[] args) throws InterruptedException {
//		=================   HW_2_Handling Frames =================================
//
//				1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
//				2) Verify on the page header "Not a Friendly Topic" displayed
//				3)Click on the Inner Frame Check box
//				4)Choose baby Cat from Animals dropdown
//				5)Quit the browser
		setUp();
		
		WebElement str = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/label/span"));
	    System.out.println(str.getText());
	    
	    
	    driver.switchTo().frame("frame1");
	    
	    driver.switchTo().frame("frame3");
	    WebElement str1 = driver.findElement(By.cssSelector("input#a"));
	    str1.click();
	    
	    Thread.sleep(1000);
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame2");
	    WebElement str2 = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
	    str2.click();
	    WebElement str3 = driver.findElement(By.cssSelector("select.col-lg-3"));
	    
	    Select dd = new Select(str3);
	    
	    dd.selectByValue("babycat");
		
		Thread.sleep(2000);
		
		
		tearDown();
	}
	
	

}
