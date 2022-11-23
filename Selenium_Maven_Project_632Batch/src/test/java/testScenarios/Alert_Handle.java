package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_Handle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		//Create new account
		//driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.xpath("//*[@id=\"banner\"]/div[2]/a")).click();
		Thread.sleep(3000);
		
		//Without fill any data, do click on Login Button
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(3000);
		//Get the alert text
		String alertText =  driver.switchTo().alert().getText();
		System.out.println(alertText);
		//Click on OK button on Alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		//Click on New User ? Register here/Activate  link
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		Thread.sleep(3000);
		String confirmationAlertText =  driver.switchTo().alert().getText();
		System.out.println(confirmationAlertText);
		//To click on OK button on Confirmation alert
		//driver.switchTo().alert().accept();
		
		//To click on CANCEL button on Confirmation alert
		driver.switchTo().alert().dismiss();
		
		
	}

}
