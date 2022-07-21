package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTask1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();

		WebElement i = driver.findElement(By.id("credit2"));
		WebElement b = driver.findElement(By.id("bank"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(i, b).perform();

		WebElement c = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement d = driver.findElement(By.id("amt7"));

		actions.dragAndDrop(c, d).perform();

		WebElement k = driver.findElement(By.id("credit1"));
		WebElement a = driver.findElement(By.id("loan"));

		actions.dragAndDrop(k, a).perform();

		WebElement s = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement p = driver.findElement(By.id("amt8"));

		actions.dragAndDrop(s, p).perform();

		WebElement textword = driver.findElement(By.xpath("(//div[@id='equal'])[1]"));
		String text = textword.getText();
		System.out.println(text);

	}

}
