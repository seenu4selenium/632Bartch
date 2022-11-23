package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class TDD {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void f() throws InterruptedException {
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		// wait statements
		Thread.sleep(6000);
		// Click on IOS app download icon
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[11]/div[2]/div/div[1]/ul/li[1]/a/img")).click();
		Thread.sleep(6000);

	}

	@AfterMethod
	public void afterMethod() throws Exception {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// From the RAM location, want to move the screenshots to Specific folder
		FileHandler.copy(abc, new File(".\\screenshots\\TDD"+timeStamp+".png"));

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
