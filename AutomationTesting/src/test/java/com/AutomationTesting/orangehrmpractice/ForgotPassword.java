package com.AutomationTesting.orangehrmpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);
		driver.close();
	}
	


}
