package com.neotech.lesson9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass5;

public class Task1 extends BaseClass5 {

//	Open chrome browser
//	Go to “https://www.techlistic.com/p/demo-selenium-practice.html”
//	Verify table consists “Financial Center”.
//	Print name of all column headers
//	Print data of all rows
//	Quit Browser
	public static void main(String[] args) {

		setUp();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement str = driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr[4]/th"));
		System.out.println(str.getText());
		
		List<WebElement> str1 = driver.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/thead/tr/th"));
		
		for(WebElement data: str1) {
			String cellData = data.getText();
			System.out.println(cellData);
		}
		
		List<WebElement> str2 = driver.findElements(By.xpath("//tbody/tr/td"));

		
		for(WebElement data: str2) {
			String cellData = data.getText();
			System.out.println(cellData);
		}
		
		
		tearDown();

	}

}
