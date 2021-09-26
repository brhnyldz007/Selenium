package com.neotech.lesson2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass2;

public class Selections extends BaseClass2{
	
//    Facebook dropdown verification
//    Open chrome browser
//    Go to https://www.facebook.com/r.php
//    Verify:
//    month dd has 12 month options
//    day dd has 31 day options
//    year dd has 117 year options
//    Select your date of birth	
//    Quit browser

	public static void main(String[] args) {
		
		setUp();
		
		//month
		WebElement str = driver.findElement(By.cssSelector("select#month"));
		Select str1 = new Select(str);
		
		List<WebElement> str2 = str1.getOptions();
		
		int m = str2.size();
		System.out.println("month has " + m + " options.");
		
		//day
		WebElement atr = driver.findElement(By.cssSelector("select#day"));
		Select atr1 = new Select(atr);
	    
	   
	    
		
		List<WebElement> atr2 = atr1.getOptions();
		
		int d = atr2.size();
		System.out.println("day has " + d + " options.");
		//year
		WebElement dtr = driver.findElement(By.cssSelector("select#year"));
		Select dtr1 = new Select(dtr);
		
		System.out.println(dtr.getText());
		
		List<WebElement> dtr2 = dtr1.getOptions();
		
		int y = dtr2.size();
		System.out.println("year has " + y + " options.");
		
		
		str1.selectByIndex(2);
		atr1.selectByValue("7");
		dtr1.selectByIndex(4);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tearDown();
	}
	
	

}
