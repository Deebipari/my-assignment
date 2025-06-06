package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// EdgeDriver driver = new EdgeDriver();
		 driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      //Search for "oneplus 9 pro". 
	        driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']")).sendKeys("oneplus 9 pro" ,Keys.ENTER);
	      //locating price of 1st phone
	       WebElement price =driver.findElement(By.xpath("//div[@class ='a-section a-spacing-small a-spacing-top-small']/div[3]//span[@class = 'a-price-whole'][1]"));
	       String total_price =price.getText();
	       System.out.println(total_price);
	        //rating of phone
	        WebElement mousehover = driver.findElement(By.xpath("(//span[@class='a-declarative']/a/i)[1]"));
            mousehover.click();
            WebElement rating = driver.findElement(By.xpath("//h2[@id ='acr-popover-title']/span[1]"));
            System.out.println(rating.getText());
            // Click the first text link of the first image. 
            driver.findElement(By.xpath("//div[@class ='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']")).click();
           //6. Take a screenshot of the product displayed. --not yet taught
          
            // switch control to child window
            Set<String> childwindow = driver.getWindowHandles();
            List<String> listwindow = new ArrayList<String>(childwindow);
            driver.switchTo().window(listwindow.get(1));
            //. Click the 'Add to Cart' button. 
            
            driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
            // Get the cart subtotal and verify if it is correct.
           WebElement total = driver.findElement(By.xpath("(//span[@class='a-price sw-subtotal-amount']//span)[4]"));
           String subtotal= total.getText();
           System.out.println(subtotal);
           if((total_price).equals(subtotal))
           {
        	   System.out.println("The subtotal is correct");
    
           }
           else
           {
	        
	        System.out.println("subtotal is mismatched");
	       
           }
           driver.quit();
	}

}
