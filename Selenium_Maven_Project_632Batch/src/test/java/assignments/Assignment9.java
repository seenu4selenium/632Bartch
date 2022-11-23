package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;


public class Assignment9 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		//Go to https://www.justrechargeit.com/SignIn.asp
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		Thread.sleep(5000);
		
	
		// Enter valid login credentials and captcha
		//driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys(" ");
		//driver.findElement(By.xpath("//*[@id=\"txtPasswd\"]")).sendKeys(" ");
		Thread.sleep(25000);
		//click in 'Secure Sign In button'
		driver.findElement(By.xpath("//*[@id=\"imgbtnSignin\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"listingtable_btnGridDelete_1\"]")).click();
		Thread.sleep(5000);
		// get the alert text
		String Text1 = driver.switchTo().alert().getText();
		System.out.println(Text1);
		//click on ok
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	
	}

}


