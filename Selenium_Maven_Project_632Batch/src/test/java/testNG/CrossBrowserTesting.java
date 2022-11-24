package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowserTesting {
	WebDriver driver;

//@Optional("HeadlessBrowser") 
	@Parameters("browsername")
	@BeforeClass // Launch the browser
	public void beforeClass(String browsername) {
		if (browsername.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("HeadlessBrowser")) {
			// Declaring and initialising the HtmlUnitWebDriver
			driver = new HtmlUnitDriver();
		}
		driver.manage().window().maximize();
	}

	@Test // Actual test cases
	public void f() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("HiallEWr34244535@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dfhgl342");
		driver.findElement(By.name("login")).click();

	}

	// @AfterClass // Close the browser
	public void afterClass() {
		driver.quit();
	}

}
