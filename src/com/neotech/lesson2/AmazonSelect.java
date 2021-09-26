package com.neotech.lesson2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass3;

public class AmazonSelect extends BaseClass3{
	
//	Amazon Department List Verification
//    Open chrome browser
//    Go to “http://amazon.com/”
//    Verify how many department options available.
//    Print each department 
//    Select Computers
//    Quit browser
	public static void main(String[] args) {
		
		setUp();
		
		Select str = new Select(driver.findElement(By.cssSelector("select#searchDropdownBox")));
		System.out.println("umber of the department's options is ==> " + str.getOptions().size());
		
		List<WebElement> str1 = str.getOptions();
		
		for(WebElement option:str1) {
			String text = option.getText();
			System.out.println("text of each department --> " + text);
		}
		
		str.selectByValue("search-alias=computers");
				
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tearDown();
	}

}
