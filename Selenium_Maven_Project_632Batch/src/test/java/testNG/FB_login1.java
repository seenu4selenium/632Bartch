package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FB_login1 {
	WebDriver driver;

	@BeforeClass // Launch the browser
	public void beforeClass() {
		driver = new ChromeDriver();
	}

	@Test // Actual test cases
	public void f() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("HiallEWr34244535@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dfhgl342");
		driver.findElement(By.name("login")).click();

	}

	@AfterClass // Close the browser
	public void afterClass() {
		driver.quit();
	}

}
