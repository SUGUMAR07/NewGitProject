package com.Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTask {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		
	
		
		
		
		
	}
	
	
}
