package com.neotech.lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
		
		WebDriver str = new ChromeDriver();
		
		str.get("https://www.facebook.com/");
		
		
        str.findElement(By.xpath("//*[text()='Create New Account']")).click();
		//str.findElement(By.linkText("Create New Account")).click();   
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        str.findElement(By.name("firstname")).sendKeys("Mila");
        str.findElement(By.name("lastname")).sendKeys("Yildiz");
        str.findElement(By.name("reg_email__")).sendKeys("asas@gmail.com");
        str.findElement(By.name("reg_email_confirmation__")).sendKeys("asas@gmail.com");
        str.findElement(By.name("reg_passwd__")).sendKeys("12334");
        str.findElement(By.name("birthday_month")).sendKeys("Aug");
        str.findElement(By.name("birthday_day")).sendKeys("12");
        str.findElement(By.name("birthday_year")).sendKeys("1988");
        WebElement sfr = str.findElement(By.name("sex"));
        
        sfr.click();
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        str.findElement(By.name("websubmit")).click();
        
         try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
        str.quit();
//        
//      Select select = new Select(driver.findElement(By.name("country")));
//		driver.findElement(By.name("country")).click();
//		List<WebElement> options = select.getOptions();
//		select.selectByValue("UNITED KINGDOM");
		
	}
}
