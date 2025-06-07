package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterization extends ProjectSpecificMethod {
    @Test(dataProvider = "loginData")
	public void dynamicusername(String dyn_name) throws Exception
	{
	 driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']/input)[1]")).sendKeys(dyn_name);
	  driver.findElement(By.xpath("//button[text()='Save']")).click();
	  //verify name
	    String name=driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println("The legal entity name is : "+name);
		
		}
    

		
	    @DataProvider(name = "loginData")
	    public Object[][] getData() {
         String[][] data=new String[3][1];
			
			data[0][0]="Salesforce Automation by Deebika";
			data[1][0]="Salesforce Automation by Murugesan";
			data[2][0]="Salesforce Automation by Parimala";
			
			return data;
			};

  

}



