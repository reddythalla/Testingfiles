package com.AutomationTesting.orangehrmpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearText {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://github.com/login");
	    WebElement Usrname_txt=driver.findElement(By.id("login_field"));
	    Usrname_txt.sendKeys("Mr Trainig");
	    Usrname_txt.clear();
	    WebElement Password_txt=driver.findElement(By.id("password"));
	    Password_txt.sendKeys("Swapnareddy");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.close();
	}

}
