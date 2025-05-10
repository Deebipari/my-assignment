package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		
		WebDriver driver = new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps/.");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Deebika");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.name("numberEmployees")).sendKeys("6");
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
        driver.findElement(By.className("smallSubmit")).click();
        String tabTitle = "Account Details | opentaps CRM";
        String title = driver.getTitle();
        System.out.println(title);
        if (title.equals(tabTitle))
        {
        	System.out.println("Title is correct");
        
        }
        	
        driver.close();
 
	
	}

        
        }


