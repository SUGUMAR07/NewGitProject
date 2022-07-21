package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		WebElement btnCloseSignup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnCloseSignup.click();

		WebElement lnkElectronics = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));

		Actions actions = new Actions(driver);
		actions.moveToElement(lnkElectronics).perform();

		WebElement btnlnkLaptops = driver.findElement(By.xpath("(//a[text()='Laptops'])[1]"));
		btnlnkLaptops.click();

		WebElement textWord = driver.findElement(By.xpath("(//span[@class='hDTmm5'])[1]"));
		String text = textWord.getText();
		System.out.println(text);
	}

}
