package com.AutomationTesting.orangehrmpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		 String expected_url="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		String actual_url=driver.getCurrentUrl();
		if(expected_url.equalsIgnoreCase(actual_url))
		{
			System.out.println("logged in successfully");
		}
		else
		{
			System.out.println("not logged in success fully");
		}
		Thread.sleep(2000);
		driver.close();
				}

}
