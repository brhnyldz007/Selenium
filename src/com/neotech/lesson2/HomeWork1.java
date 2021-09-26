package com.neotech.lesson2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
	
	public final static String url = "https://demoqa.com/radio-button";
	private static List<WebElement> radio1;
	private static List<WebElement> radio2;
	private static List<WebElement> radio3;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		List<WebElement> radioList = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement radio : radioList) {
			if (radio.isEnabled()) {
				System.out.println("Radio is enabled!");
			} else {
				System.out.println("Radio is NOT enabled!");
			}
		}

		List<WebElement> labelList = driver
				.findElements(By.xpath("//label[starts-with(@class, 'custom-control-label')]"));
		for (WebElement label : labelList) {
			if (label.isDisplayed()) {
				System.out.println("Label is displayed!");
			} else {
				System.out.println("Label is NOT displayed!");
			}
		}

		System.out.println("------------------------------");
		WebElement yesLabel = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yesLabel.click();

		WebElement yesRadio = driver.findElement(By.id("yesRadio"));
		if (yesRadio.isSelected()) {
			System.out.println("Yes is Selected");
		} else {
			System.out.println("Yes is NOT Selected");
		}
		System.out.println("------------------------------");

		WebElement noLabel = driver.findElement(By.xpath("//label[@for='noRadio']"));
		noLabel.click();

		WebElement noRadio = driver.findElement(By.id("noRadio"));
		if (noRadio.isSelected()) {
			System.out.println("No is Selected");
		} else {
			System.out.println("No is NOT Selected");
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();
	}

}
