package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test2 extends ProjectSpecificMethod {
  @Test
	public void Company_name()
	{
	
		WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(20));
		JavascriptExecutor js=(JavascriptExecutor) driver;
 //Enter the Company name as 'TestLeaf'. 
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
    
	}
	
}
