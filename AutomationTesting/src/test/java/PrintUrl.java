import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		String app = driver.getCurrentUrl();
		System.out.println(app);
		Thread.sleep(5000);
        driver.get("https://github.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
		Thread.sleep(5000);
		driver.close();
		
	}

}

