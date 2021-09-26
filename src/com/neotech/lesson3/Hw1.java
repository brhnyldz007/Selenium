package com.neotech.lesson3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass5;

public class Hw1 extends BaseClass5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/i")).click();
		
		WebElement str =driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[2]"));
        str.click();
        
        driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[5]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a/i")).click();
        
        WebDriverWait str2 = new WebDriverWait(driver, 15);
        str2.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a/i"))));
		
	   // Thread.sleep(3000);
		tearDown();
	}

}
