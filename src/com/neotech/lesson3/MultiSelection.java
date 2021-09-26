package com.neotech.lesson3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.BaseClass5;

public class MultiSelection extends BaseClass5 {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div")).click();
		
		
		//css
		WebElement str =driver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[2]"));
        str.click();
        
        
        WebDriverWait st = new WebDriverWait(driver,15);
        st.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a"))));
       
        
		//html
        WebElement str1 =driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[5]"));
        str1.click();
	
        
        WebDriverWait st1 = new WebDriverWait(driver,15);
        st1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[2]")));
        
        
        driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[2]/i")).click();
        WebDriverWait st2 = new WebDriverWait(driver,15);
        st2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[2]")));
        
        
        driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a/i")).click();
        WebDriverWait st3 = new WebDriverWait(driver,15);
        st3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a")));
        
      //*[@id="example"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a[2]/i
		tearDown();
	}

}
