package com.AutomationTesting.radiobutton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
