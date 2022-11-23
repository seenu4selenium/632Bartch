package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("pre");
		driver.findElement(By.name("lastName")).sendKeys("dev");
		driver.findElement(By.name("emailAddress")).sendKeys("dev@123");
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567898");
		driver.findElement(By.name("password")).sendKeys("abcdefg");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("abcdefg");

		driver.findElement(By.name("questions[q_135]")).click();
		driver.findElement(By.name("questions[q_136]")).click();
		driver.findElement(By.name("questions[q_137]")).click();
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

	}

}
