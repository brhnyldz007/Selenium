package com.neotech.lesson2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork {

	public final static String url = "https://www.amazon.com/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		WebDriver str = new ChromeDriver();

		str.get(url);

		List<WebElement> linkNumber = str.findElements(By.tagName("a"));
		int size = linkNumber.size();
		
		int count = 0;
		for (WebElement text : linkNumber) {
			if (!text.getText().isEmpty()) {
				System.out.println(text.getText());
				count++;
			}

		}

		System.out.println("number of all link is " + size);
		System.out.println("number of all link which has text ===> " + size);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		str.close();

	}

}
