package com.locator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Robot robot = new Robot();

		// press shift
		robot.keyPress(KeyEvent.VK_SHIFT);

		// press sugumar

		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);

		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_R);

		// Release shift
		robot.keyPress(KeyEvent.VK_SHIFT);

		// PRESS tab

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		// press shift
		robot.keyPress(KeyEvent.VK_SHIFT);

		// PRESS PASSWORD Amma@123
		robot.keyPress(KeyEvent.VK_A);

		// Release shift
		robot.keyPress(KeyEvent.VK_SHIFT);

		// PRESS PASSWORD Amma@123
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_AT);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_3);

		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_AT);
		robot.keyRelease(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_3);

		
		
	}

}
