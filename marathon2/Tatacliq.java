package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tatacliq {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		//Load url as https://www.tatacliq.com/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//MouseHover on 'Brands'
        
	     WebElement brands = driver.findElement(By.xpath("//div[text( ) ='Brands']"));
	     //create action object
	      Actions act = new Actions(driver);
	      act.moveToElement(brands).perform();
	
	      
	   //MouseHover on 'Watches & Accessories'
	      WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
	      act.click().moveToElement(watch).perform();
	 
	      
	  //Choose the first option from the 'Featured brands'.
	      WebElement casio = driver.findElement(By.xpath("//div[text( ) ='Casio']"));
	      casio.click();
	      
	  //Select sortby: New Arrivals
	      WebElement drp_down = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
	      Select select = new Select(drp_down);
	      select.selectByValue("isProductNew");
	     
	      
	  //choose men from catagories filter.
	      driver.findElement(By.xpath("//div[text()='Men']")).click();
	    
	  //print all price of watches
	      //observed stale element exception use webdriver wait
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ProductDescription__priceHolder']/h3")));


         List<WebElement> priceof_watches = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
         System.out.println("Prices of watches:");
         for(WebElement pr:priceof_watches)
	     {
	    	System.out.println(pr.getText());
	    	 
        	}
         
         
      //click on the first resulting watch
          WebElement first_watch = driver.findElement(By.xpath("//div[@class='ProductModule__content']"));
          JavascriptExecutor js = (JavascriptExecutor)driver;
          js.executeScript("arguments[0].click();", first_watch);
      
          
      //click Add to Bag   and  get count from the Bag cart icon.
          Set<String> windowID = driver.getWindowHandles();
          List<String> windowlist= new ArrayList(windowID);
          String parentwindow= windowlist.get(0);
          String childwindow= windowlist.get(1);
          driver.switchTo().window(childwindow);
          
          driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
          System.out.println("totalitem on bag icon:"+ driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText());

      //Click on the Bag cart icon
          driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
          
          
      //compare two price are similar
       String actual_price = driver.findElement(By.xpath("//div[@class='CartItemForDesktop__informationTextWithBolder']")).getText();    
       String addtocart_price = driver.findElement(By.xpath("//div[@class='DesktopCheckout__price']")).getText();  
       if(actual_price.equals(addtocart_price))
       {
    	   System.out.println("The prices are equal");
       }
       else
       {
    	   System.out.println("Addition processing fee has been added");
       }
	
	 //Take a snap of the resulting page. 
       TakesScreenshot ts = (TakesScreenshot)driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File trg = new File("C:\\my_workspace\\Selenium\\screenshot\\price.png");
	   FileUtils.copyFile(src, trg);
	}

}
/*

11. compare two price are similar
12. Take a snap of the resulting page. 
13. Close All the opened windows one by one.
*/