package com.neotech.lesson2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass5;

public class AlertText extends BaseClass5 {
	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='category-cards']/div[3]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Alerts']")).click();

		WebElement confirmBtn = driver.findElement(By.id("confirmButton"));
		confirmBtn.click();
		Thread.sleep(1000);

	
		Alert alert = driver.switchTo().alert();
		System.out.println("The text of the alert is -> " + alert.getText());
		alert.dismiss();

		String resultText = driver.findElement(By.id("confirmResult")).getText();
		System.out.println("resultText is -> " + resultText);

		Thread.sleep(1000);

	
		confirmBtn.click();
		alert.accept();

		resultText = driver.findElement(By.id("confirmResult")).getText();
		System.out.println("resultText is -> " + resultText);

		Thread.sleep(4000);

		tearDown();
	}

}
