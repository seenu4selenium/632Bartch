package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment5  {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		
		//Go to URL https://www.justrechargeit.com/
		driver.get("https://www.justrechargeit.com/");
		//Click on CreateNewAccount hyper link
		driver.findElement(By.linkText("Create New Account")).click();
		//Type NAme edit box (any dummy data)
		driver.findElement(By.id("signup_name")).sendKeys("Abcd");
		//Click on Refresh iconwait for few second
		Thread.sleep(1000);
		driver.navigate().refresh();
		//click on Back iconwait for few secondthen
		driver.navigate().back();
		//click on Forward icon
		driver.navigate().forward();
		
		

	}

}


	
	
	
	
	