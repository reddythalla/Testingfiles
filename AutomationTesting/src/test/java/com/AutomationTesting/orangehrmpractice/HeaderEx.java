package com.AutomationTesting.orangehrmpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeaderEx {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://github.com/login");
		WebElement header=driver.findElement(By.xpath("//h1"));
		String Page_header = header.getText();
		System.out.println("page_header");
		String expected="Sign in to GitHub";
	if(Page_header.equals(expected)) {
		System.out.println("correct logged in");
	}
		else
		{
			System.out.println("not correct");
		}
	driver.close();
	}
	}


