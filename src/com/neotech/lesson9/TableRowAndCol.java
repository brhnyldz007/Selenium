package com.neotech.lesson9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class TableRowAndCol  extends CommonMethods{
	
	public static void main(String[] args) {
		setUp();
		
		//rows size for all the table
		List<WebElement> str = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
		int str2 = str.size();
		System.out.println("The number of the rows is ==> " + str2);
		//Take the text from all the cells
		for(WebElement text : str) {
			String text1 = text.getText();
			System.out.println("The texts in the table ==> " + text1);
		}
		System.out.println();
		//all text from first row
		List<WebElement> firstRow = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr[1]/th"));
		for(WebElement texts : firstRow) {
			String texts1 = texts.getText();
			System.out.println("The texts of the first row ==> " + texts1);
		}
		System.out.println();
		//cols size for all the table
				List<WebElement> cols = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr/th"));
				int cols1 = str.size();
				System.out.println("The number of the cols is ==> " + str2);
				
				
	
		tearDown();
	}

}
