package com.neotech.lesson1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hw4 {
	
	public final static String url = "http://demo.guru99.com/test/newtours/";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		
		WebDriver str = new ChromeDriver();
		str.get(url);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		str.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		str.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Mila");
		str.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Yildiz");
		str.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("12345");
		str.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("asad@gmail.com");
		
		Select selectMonth = new Select(str.findElement(By.xpath("//select[@name=\"country\"]")));
		selectMonth.selectByVisibleText("UNITED STATES");
		
		str.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Mila");
		str.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12345");
		str.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("12345");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		str.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		str.quit();
		
	}

}
