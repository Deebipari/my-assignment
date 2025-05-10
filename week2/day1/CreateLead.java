package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Deebika");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugesan");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");
        driver.findElement(By.className("smallSubmit")).click();
        String title = driver.getTitle();
        System.out.println(title);
        
        driver.close();
 

        

        
        

	}

}
