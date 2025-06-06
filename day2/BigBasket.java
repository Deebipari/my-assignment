package week5.day2;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasket {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
       //- Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//- Load the URL (https://www.bigbasket.com/)
		driver.get("https://www.bigbasket.com/");
		//maximize the page
		driver.manage().window().maximize();
		//add wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//. Click on "Shop by Category".
		driver.findElement(By.xpath("//div[@class='Header___StyledCategoryMenu2-sc-19kl9m3-13 ibVaum']//button[@type ='button']")).click();
	    Thread.sleep(2000);
		//Mouse over "Foodgrains, Oil & Masala"
		WebElement mousehover = driver.findElement(By.xpath("(//div[@class='CategoryMenu___StyledMenuItems-sc-d3svbp-4 fpskRu']/nav/ul)[1]/li//a[text() ='Foodgrains, Oil & Masala']"));
	//	WebElement mousehover = driver.findElement(By.linkText("Foodgrains, Oil & Masala"));
		//action class
		Actions act = new Actions(driver);
		act.moveToElement(mousehover).perform();
		//Mouse over "Rice & Rice Products".
        WebElement rice =driver.findElement(By.linkText("Rice & Rice Products"));
        act.moveToElement(rice).perform();
        //5. Click on "Boiled & Steam Rice".
        WebElement boiled_rice = driver.findElement(By.linkText("Boiled & Steam Rice"));
        act.click(boiled_rice).perform();
        //6. Filter the results by selecting the brand "bb Royal".
       // WebElement bb_royal = driver.findElement(By.xpath("//input[@id ='i-BBRoyal']"));
        WebDriverWait mywait =new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement  bb_royal = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id ='i-bbRoyal' and @type='checkbox']")));
       JavascriptExecutor js = driver;
       //scroll the the element
       js.executeScript("arguments[0].scrollIntoView(true);",bb_royal);
        bb_royal.click();
        
       //7. Click on "Tamil Ponni Boiled Rice". 
         WebElement tamil_ponni= mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class ='h-full']//h3[text() ='Tamil Ponni Boiled Rice']")));
         js.executeScript("arguments[0].scrollIntoView(true);",tamil_ponni);
         tamil_ponni.click();
        
         //switch driver control to child window ;
         Set<String> windowID = driver.getWindowHandles();
         List<String> windowlist = new ArrayList(windowID);
         String parentwindow = windowlist.get(0);
         String childwindow = windowlist.get(1);
         driver.switchTo().window(childwindow);
      //8. Select the 5 Kg bag. 
         System.out.println(driver.getTitle());
         
        boolean bag_selected =driver.findElement(By.xpath("//div[@class='flex justify-start w-full h-full']//span[text() ='5 kg']")).isEnabled();
        
       if(bag_selected == true )
       {
    	   System.out.println("Already 5 kg bag is selected by default ");
       }
       else 
       {
    	   System.out.println("Not selected");
       }
     //9. Check and note the price of the rice. 
      
      System.out.println(driver.findElement(By.xpath("//table/tr[2]/td[1]")).getText());
    //10. Click "Add" to add the bag to your cart.
      driver.findElement(By.xpath("(//button[text() ='Add to basket'])[1]")).click();
      Thread.sleep(2000);
      //11. Verify the success message that confirms the item was added to your cart. 
     String expected_text="An item has been added to your basket successfully";
     String actual_text = driver.findElement(By.xpath("//p[@class ='mx-4 flex-1']")).getText();
     if(expected_text.equals(actual_text))
     {
    	 System.out.println("Item has been added and verified");
     }
      //
     //12. Take a snapshot of the current page 
    File source =driver.getScreenshotAs(OutputType.FILE);
    File destination = new File("/D:\\TestLeaf\\Selenium\\src\\main\\java\\week5\\day2\\Screenshot\\img.png");
    FileUtils.copyFile(source, destination);
    
     //13. Close the current window. 
     driver.close();
     //14. close parent window
     driver.switchTo().window(parentwindow);
     driver.close();
	}

}
