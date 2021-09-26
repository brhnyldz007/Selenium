package com.neotech.lesson2;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenOrangeHRM1 {
	public static void main(String[] args) throws Exception {
		
	
	//we read the configuration file
	
	String filepath = System.getProperty("user.dir") + "/configs/configuration.properties";
	FileInputStream fis = new FileInputStream(filepath);
	
	//we load all the rows in key=value pair
	Properties prop = new Properties();
	prop.load(fis);
	
	System.out.println(prop);
	
	//Starting with selenium classes and methods
	WebDriver driver = null;
	if(prop.getProperty("browser").equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
	}else if (prop.getProperty("browser").equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		driver = new FirefoxDriver();
	}

	String website = prop.getProperty("url");
	driver.get(website);

	String title = driver.getTitle();
	System.out.println("title -> " + title);

	Thread.sleep(3000);

	driver.close();
	
	}
}
