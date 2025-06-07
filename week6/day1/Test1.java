package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends ProjectSpecificMethod {
   
	@Test
	public void Username()
	{
	  driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']/input)[1]")).sendKeys(" Saleforce Automation by Deebi");
	  driver.findElement(By.xpath("//button[text()='Save']")).click();
	  //verify name
	    String name=driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println("The legal entity name is : "+name);
		String actual_name ="Saleforce Automation by Deebi";
		if(name.equals(actual_name))
		{
			System.out.println("Name is correct");
		}
		else
		{
			System.out.println("Name is wrong");
			System.out.println(name);
		}
	      

       

		
	}
	
}
