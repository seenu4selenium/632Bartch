package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBlogin {

	@Test
	public void f() {
		WebDriver driver;
		driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("HiallEWr34244535@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dfhgl342");
		driver.findElement(By.name("login")).click();
	}
}
