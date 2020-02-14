package startbootstrap.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterStartbootstrap {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:9090/startbootstrap/register.html");
	}
	
	@Test
	public void Registration() {
		driver.findElement(By.xpath("//input[@id='exampleFirstName']")).sendKeys("Manjunath");
		driver.findElement(By.xpath("//input[@id='exampleLastName']")).sendKeys("Mindtree");
		driver.findElement(By.xpath("//input[@id='exampleInputEmail']")).sendKeys("Manjunathreddy@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword']")).sendKeys("Manju@123");
		driver.findElement(By.xpath("//input[@id='exampleRepeatPassword']")).sendKeys("Manju@123");
		driver.findElement(By.xpath("//a[contains(text(),'Register Account')]")).click();
		System.out.println("Registration is successful");
	}
	
	@Test
	public void Login() {
		driver.get("http://localhost:9090/startbootstrap/login.html");
		driver.findElement(By.xpath("//input[@id='exampleInputEmail']")).sendKeys("Manjunathreddy@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword']")).sendKeys("Manju@123");
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		System.out.println("Login is successful");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
