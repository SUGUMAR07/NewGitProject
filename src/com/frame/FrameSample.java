package com.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");
		driver.manage().window().maximize();

		WebElement btnclick = driver.findElement(By.xpath("(//a[@class='btn btn-default redBtn'])[2]"));
		btnclick.click();

		WebElement element = driver.findElement(By.xpath("//frame[@src='RSNBLogin.html?v=7']"));

		List<WebElement> elements = driver.findElements(By.xpath("//frame[@src='RSNBLogin.html?v=4']"));
		Dimension size = element.getSize();
		System.out.println(size);
	}

}
