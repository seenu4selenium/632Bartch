package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;


public class Assignment8 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		//Go to https://demoqa.com/alerts
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		
	// 1.Click on the first "click me" button
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		//Get the text from alert
		String Confirmationalert1 = driver.switchTo().alert().getText();
		System.out.println(Confirmationalert1);
		
		//System.out.println(driver.switchTo().alert().getText());
		
		//click on ok
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
	//2.click on second 'Click me' button
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(7000);
		//Get the text from Alert 
		String Confirmationalert2 = driver.switchTo().alert().getText();
		System.out.println(Confirmationalert2);
		//click on OK button
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
	//3.click on third 'Click me' button
	driver.findElement(By.id("confirmButton")).click();
		//Get the text from confirmAlert  
		Thread.sleep(5000);
		String Confirmationalert3 =driver.switchTo().alert().getText();
		System.out.println(Confirmationalert3);
		//click on OK button
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		// displays 'You selected OK
		String textok = driver.findElement(By.xpath("//*[@id=\"confirmResult\"]")).getText();
		                                               //*[@id="confirmResult"]
		System.out.println(textok);
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		//click on Cancel button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		// Displays 'You selected Cancel'
		String textcancel = driver.findElement(By.xpath("//*[@id=\"confirmResult\"]")).getText();
		System.out.println(textcancel);
		Thread.sleep(5000);
		
	// 4.click on fourth 'Click me' buton
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		Thread.sleep(5000);
		//type in the prompt 
		driver.switchTo().alert().sendKeys("Preeti");
		Thread.sleep(5000);
		// click on ok
		driver.switchTo().alert().accept();
		//Thread.sleep(6000);
		String text4 = driver.findElement(By.xpath("//*[@id=\"promptResult\"]")).getText();
		System.out.println(text4);
		Thread.sleep(5000);
		driver.quit();
	
	}

}

