package com.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			
			driver.manage().window().maximize();
			
			WebElement btnNewRegister = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
			btnNewRegister.click();
			
			WebElement txtUsername = driver.findElement(By.id("username"));
			txtUsername.sendKeys("sugumar23");
			
			WebElement txtPassword = driver.findElement(By.id("password"));
			txtPassword.sendKeys("sugu2345");
			
			WebElement txtConfirmPassword = driver.findElement(By.id("re_password"));
			txtConfirmPassword.sendKeys("sugu2345");
			
			WebElement txtFullname = driver.findElement(By.id("full_name"));
			txtFullname.sendKeys("Sugumar");
			
			WebElement txtEmail = driver.findElement(By.id("email_add"));
			txtEmail.sendKeys("suguzylikesu@gmail.com");
			
			Thread.sleep(10000);
			
			WebElement btnTerms = driver.findElement(By.id("tnc_box"));
			btnTerms.click();
			
			WebElement btnRegister = driver.findElement(By.id("Submit"));
			btnRegister.click();
			
			WebElement btnclicktoLogin = driver.findElement(By.xpath("//a[text()='Click here to login']"));
			btnclicktoLogin.click();
			
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
