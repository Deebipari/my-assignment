package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	 public RemoteWebDriver driver;
	 
	 
	 @Parameters({"browser","url","username","password"})
		@BeforeMethod
	
		  public void preConditions(String browser,String url,String uName,String pwd) throws Exception{
		 System.out.println("Inside");
			 if (browser.equalsIgnoreCase("chrome")) {
					ChromeOptions opt=new ChromeOptions();
					opt.addArguments("guest");
					driver=new ChromeDriver(opt);
				} else if(browser.equalsIgnoreCase("Edge")) {
					driver = new EdgeDriver();
				}
			 // Login to https://login.salesforce.com
			  driver.get(url);
			  System.out.println("Recevied url" + url);
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
			  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			  driver.findElement(By.xpath("//input[@id='Login']")).click();
			  
			  //Click on the toggle menu button from the left corner 
			  driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			  
			  //Click View All and click Legal Entities from App Launcher
			  driver.findElement(By.xpath("//button[text()='View All']")).click();
			  
			 WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(20));
			  WebElement legal_entities =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-label='Legal Entities']/span//span/p[text() ='Legal Entities']")));
			  JavascriptExecutor js =(JavascriptExecutor) driver;
			  js.executeScript("arguments[0].scrollIntoView(true);",legal_entities );
			  mywait.until(ExpectedConditions.elementToBeClickable(legal_entities));
			  try
			  {
			  legal_entities.click();
			  } catch (Exception e) {
				  
				  js.executeScript("arguments[0].click();",legal_entities );
			  }
			  
			  
			  //- Click on the Dropdown icon in the legal Entities tab 
			  Thread.sleep(2000);
		     WebElement dropdown = mywait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='slds-button slds-button_reset']/span[text() ='Legal Entities List']"))));
		     js.executeScript("arguments[0].click();",dropdown);
		     
		     // - Click on New Legal Entity 
		    WebElement new_legal_entity= driver.findElement(By.xpath("//div[@class ='menuItemsWrapper']//span/span[text() ='New Legal Entity']"));
		    js.executeScript("arguments[0].click();",new_legal_entity);
		    
		  /*   //Enter the Company name as 'TestLeaf'. 
		     driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		     WebElement description = driver.findElement(By.xpath("(//div[@class ='slds-form-element__control slds-grow textarea-container'])[2]"));
		     js.executeScript("arguments[0].innerText='Salesforces';", description);
		     //- Select Status as 'Active'
		   //  driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		     WebElement nonedd =mywait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='slds-combobox_container']"))));
			  js.executeScript("arguments[0].scrollIntoView(true);",nonedd);
			  nonedd.click();
			  driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Active']")).click();
			 // driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']/input)[1]")).sendKeys("Deebi");
			  // Click on Save 
			  driver.findElement(By.xpath("//button[text()='Save']")).click();
			  // - Verify the Alert message (Complete this field) displayed for Name        

		        System.out.println(driver.findElement(By.xpath("//div[@class ='fieldLevelErrors']")).getText());
		     */
			  
			  
			  

	}
}

