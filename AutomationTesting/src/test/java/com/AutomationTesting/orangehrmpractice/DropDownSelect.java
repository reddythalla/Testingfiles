package com.AutomationTesting.orangehrmpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://courses.letskodeit.com/practice");
	WebElement carslist= driver.findElement(By.id("carselect"));
	Select select = new Select(carslist);
	select.selectByVisibleText("Honda");
	Thread.sleep(2000);
}
}
