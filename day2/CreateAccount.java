package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args)
	{
	
		// TODO Auto-generated method stub
	    //instantiate the browser driver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		
		WebDriver driver = new ChromeDriver(options);
		//load URL
        driver.get("http://leaftaps.com/opentaps/.");
        //maximize window
        driver.manage().window().maximize();
        //locate and enter user name
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //locate and enter password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //click login button
        driver.findElement(By.className("decorativeSubmit")).click();
        //click on CRM/SFA link
        driver.findElement(By.partialLinkText("CRM")).click();
        //click on account tab
        driver.findElement(By.linkText("Accounts")).click();
        //click on create account
        driver.findElement(By.linkText("Create Account")).click();
        //locate and enter accountname
        driver.findElement(By.id("accountName")).sendKeys("Parimala");
        //locate and enter description
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        //select computer software as industry
        //locate and store in local variable
        WebElement industrydropdown = driver.findElement(By.name("industryEnumId"));
        Select test = new Select(industrydropdown);
        test.selectByValue("IND_SOFTWARE");
        //select ownership by visible text
        WebElement ownership= driver.findElement(By.name("ownershipEnumId"));
        Select test1 = new Select(ownership);
        test1.selectByVisibleText("S-Corporation");
        //select employee as source by select by value
        WebElement source= driver.findElement(By.id("dataSourceId"));
        Select test2 = new Select(source);
        test2.selectByValue("LEAD_EMPLOYEE");
        //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
        WebElement marketing_Campaign= driver.findElement (By.id("marketingCampaignId"));
        Select test3 = new Select(marketing_Campaign);
        test3.selectByIndex(6);
       // Select "Texas" as the state/province using SelectByValue
        WebElement state= driver.findElement(By.id("generalStateProvinceGeoId"));
        Select test4 = new Select(state);
        test4.selectByValue("TX");
        //Click the "Create Account" button.
        driver.findElement(By.className("smallSubmit")).click();
        //Ignoring duplicate account 
       // driver.findElement(By.linkText("Create Account Ignoring Duplicates")).click();
        //verifying title
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
