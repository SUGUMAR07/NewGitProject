package com.alert;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement btnalerttextbox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btnalerttextbox.click();

		WebElement btnpromotbox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnpromotbox.click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("WELCOME SUGUMAR");
		alert.accept();

		WebElement textword = driver.findElement(By.id("demo1"));
		String text = textword.getText();
		System.out.println(text);

	}

}
