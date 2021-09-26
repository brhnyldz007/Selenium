package com.neotech.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;

public class FrameDemo extends CommonMethods {

	public static void main(String[] args) {
		setUp();

		switchToFrame("frame1");

		switchToFrame("frame3");

		WebElement str1 = driver.findElement(By.cssSelector("input#a"));
		str1.click();

		wait(2);

		driver.switchTo().defaultContent();

		switchToFrame("frame2");

		WebElement str2 = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
		str2.click();
		WebElement str3 = driver.findElement(By.cssSelector("select.col-lg-3"));

		Select dd = new Select(str3);

		dd.selectByValue("babycat");
		
		wait(2);

		tearDown();
	}

}
