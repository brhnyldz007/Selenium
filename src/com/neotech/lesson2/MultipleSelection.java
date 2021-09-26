package com.neotech.lesson2;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass4;

public class MultipleSelection  extends BaseClass4{
//	 Open chrome browser
//     Go to “https://semantic-ui.com/modules/dropdown.html”
//     Scroll down to “Multiple Selection”
//     Click on drop down and select “CSS” and “HTML”
//     Verify value has been selected
//     Deselect 1 of the option from the dropdown
//     Quit browser
	public static void main(String[] args) {
		
	
	setUp();
	
	
	WebElement str = driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div"));
	str.click();

	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//css
	WebElement cssOption = driver
			.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[2]"));
	System.out.println("cssOption text is -> " + cssOption.getText());
	cssOption.click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//html
	driver.findElement(
			By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[text()='HTML']"))
			.click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//deselect css
	driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a/i"))
	.click();
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       // Clicking on the X next to HTML, to deselect it
 		driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a/i"))
 				.click();

 		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	tearDown();
	}
}
