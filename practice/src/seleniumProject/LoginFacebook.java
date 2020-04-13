package seleniumProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginFacebook {
	public static void main(String args[]) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("7987369522");
		driver.findElement(By.name("pass")).sendKeys("Mishru2805");
		driver.findElement(By.id("loginbutton")).click();
		 
		
	}

}
