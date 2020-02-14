package startbootstrap.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginSTartbootStrap {
	
WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:9090/startbootstrap/login.html");
		System.out.println("Browser is launched");
	}
	
	@Test
	public void fillRegistration() {
		driver.findElement(By.xpath("//input[@id='exampleInputEmail']")).sendKeys("Manjunathreddy@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword']")).sendKeys("Manju@123");
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		System.out.println("Login is successful");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed");
	}

}
