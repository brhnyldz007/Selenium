package com.neotech.test;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class AlertTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();
		
		//click on the alert button
		driver.findElement(By.id("alert")).click();
		
		//get text and accept the alert
		System.out.println(getAlertText());
		
		wait(2);
		acceptAlert();
		
		wait(2);
	
		//click on the confirm button
		driver.findElement(By.id("confirm")).click();
		wait(2);
		dismissAlert();
		
		wait(2);
		
		//handling prompt
		driver.findElement(By.id("prompt")).click();
		wait(2);
		sendAlertText("Sabah");
		wait(4);
		acceptAlert();
		wait(2);
		
		tearDown();
		
	}

}
