package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.name("txtUserName")).sendKeys("skjd");
		
		driver.findElement(By.name("txtPasswd")).sendKeys("test123");
		driver.findElement(By.name("txtCaptcha")).sendKeys("23");
		driver.findElement(By.name("imgbtnSignin")).click();

	}

}
