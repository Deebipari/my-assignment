package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiclocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate the browser driver
		
				ChromeDriver driver = new ChromeDriver();
				
				// load URL
				driver.get("https://www.facebook.com/");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//to find and add inputs in username
				driver.findElement(By.id("email")).sendKeys("Deebika");
				
				//to find and add inputs in password
				driver.findElement(By.id("pass")).sendKeys("xyz");
				
				//to click login button
				driver.findElement(By.name("login")).click();
				
				//get title of the page
				String title=driver.getTitle();
				System.out.println(title);
				

	}

}
