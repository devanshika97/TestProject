package seleniumProject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffMailPopUp {
public static void main (String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='Register']")).click();

		Thread.sleep(5000);
	

	Alert alert= driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	
}
}
