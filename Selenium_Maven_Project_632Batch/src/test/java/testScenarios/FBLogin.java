package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FBLogin {

	public static void main(String[] args) throws Exception {
		// Selenium people has developed number method/clases/pckg..
		// Download the Selenium jar file and placed into your project
		// I want to use all methods developed by selenium ppl into my local system
		// Create an object for Selenium interface
		// use the same referenceName/Objectname for calling existing
		// classes/methods/pckgs

		//Step-1: Create an object for Selenium interface
		// CLASSNAME referenceName = new CLASSNAME();
		WebDriver driver;

		// Open chrome browser
		driver = new ChromeDriver();
		
		driver.get("http://mis.nyiso.com/public/");
		Thread.sleep(3000);
		//Find the iframe count
		driver.switchTo().defaultContent();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int numberOfFrames = Integer.parseInt(js.executeScript("return window.length").toString());//3
		System.out.println("Number of iframes on the page are: " + numberOfFrames);
		
		
		driver.switchTo().frame(1);
		driver.findElement(By.name("P-24Alist")).click();
		
		
//		// type URL
//		driver.get("https://www.facebook.com/");
//
//		// Type UN & PWD
//		driver.findElement(By.id("email")).sendKeys("HiallEWr34244535@gmail.com");
//		
//		driver.findElement(By.name("pass")).sendKeys("dfhgl342");
//
//		// Click on Login button
//		driver.findElement(By.name("login")).click();

	}

}
