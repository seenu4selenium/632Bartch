package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadLessBrowserExecution {
	@Test
	public void f() throws Exception {

		// Declaring and initialising the HtmlUnitWebDriver
		WebDriver driver = new HtmlUnitDriver(); //2.584
	//	 WebDriver driver = new ChromeDriver(); //2.86
//		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
//		Thread.sleep(9000);
//		driver.findElement(By.name("uName")).sendKeys("Hi All");

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("HiallEWr34244535@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dfhgl342");
		driver.findElement(By.name("login")).click();

	}
}
