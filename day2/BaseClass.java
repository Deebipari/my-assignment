package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameters;

public class BaseClass {

	  public RemoteWebDriver driver;
	  
		 
	@BeforeMethod
	public void preConditions(String browser,String url,String uName,String pwd) {
		  if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("guest");
			driver=new ChromeDriver(opt);
		} else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		 
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postConditions() {
		driver.close();
	}
	
}
