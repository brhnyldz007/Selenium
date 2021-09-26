package com.neotech.lesson9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass5;

public class deltaComDynamicTable extends BaseClass5 {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		driver.findElement(By.xpath("//span[@id='calReturnLabelCont']/span[2]")).click();

		String month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();

		System.out.println(month);
		// Loop until we see January
		while (!month.equals("January")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		Thread.sleep(3000);

		// get all the cells from the calendar (including the empty cells)
		List<WebElement> cells = driver.findElements(
				By.xpath("//table[@class='dl-datepicker-calendar']/tbody[@class='dl-datepicker-tbody-0']/tr/td"));

		// Iterate until I find the day that I want (21st)
		for (WebElement day : cells) {
			String dayNum = day.getText();
			if (dayNum.equals("21")) {
				day.click();
				break;
			}
		}
		Thread.sleep(3000);

		// Use the same logic to find the return month (April)
		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();

		// Loop until we see April
		while (!returnMonth.equals("April")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='donebutton']")).click();
		
		Thread.sleep(3000);
		
		tearDown();
	}

}
