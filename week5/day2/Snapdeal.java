package week5.day2;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//- Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//- Load the URL (https://www.bigbasket.com/)
		driver.get("https://www.snapdeal.com/");
		//maximize the page
		driver.manage().window().maximize();
		//add wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement mouse_hover = driver.findElement(By.xpath("//span[@class=\"catText\" and text() =\"Men's Fashion\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);
		//Go to "Sports Shoes"
		driver.findElement(By.xpath("(//span[@class ='linkTest'])[1]")).click();
		//Get the count of sports shoes
		WebElement count = driver.findElement(By.xpath("//div[contains(text() ,'Sports Shoes for Men')]/following-sibling::div"));
	    System.out.println(count.getText());
		//5. Click on "Training Shoes".
	    driver.findElement(By.xpath("//div[contains(text(), 'Training Shoes')]")).click();
	    //6. Sort the products by "Low to High"
	    driver.findElement(By.xpath("//span[@class='sort-label']")).click();
	    driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
	    //7. Check if the displayed items are sorted correctly
	    Thread.sleep(2000);
	    List<WebElement> actual_list = driver.findElements(By.xpath("//div[@class='lfloat marR10']//span[@class ='lfloat product-price']"));
	    List<Integer> list=new ArrayList<Integer>();
        for(WebElement each : actual_list)
       {

        	String text1 = each.getText();
        	text1 =text1.replaceAll("[^0-9]","" );
            list.add(Integer.parseInt(text1));      
       }
        
        System.out.println(list);
	    
      List<Integer> sortedList = new ArrayList<Integer>(list);
        Collections.sort(sortedList);
        System.out.println(sortedList);
        if((list).equals(sortedList))
        {
        	System.out.println("It is sorted");
        }
        else 
        {
        	System.out.println("list of item is not in sorted order");
        }
    //8. Select any price range ex:(500-700).   
        Thread.sleep(2000);
	  WebElement low_range =  driver.findElement(By.xpath("//input[@class='input-filter']"));
	  low_range.clear();
	  low_range.sendKeys("500");
	  Thread.sleep(2000);
	  WebElement high_range =  driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
      high_range.clear();
      high_range.sendKeys("700");
      driver.findElement(By.xpath("//div[@class ='price-go-arrow btn btn-line btn-theme-secondary']")).click();
	  
     //9. Filter by any colour.
      Thread.sleep(3000);
     WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(20));
      WebElement colour= mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'White & Blue')]")));
     JavascriptExecutor js = driver;
    js.executeScript("arguments[0].click();", colour);
     
      
     String filter1 = driver.findElement(By.xpath("//div[@class='filters-top-selected']/div/div/a")).getText();
     String filter2 = driver.findElement(By.xpath("(//div[@class='filters-top-selected']/div/div/a)[2]")).getText();
   //  System.out.println(filter1);
     String expected_filter1= "Rs. 500 - Rs. 700";
     String expected_filter2 = "White & Blue";
     if(filter1.equals(expected_filter1) && filter2.equals(expected_filter2))
     {
    	 System.out.println("Filter are selected propertly");
     }
     else
    	 System.out.println("Filter not selected properly");

    //11. Mouse hover on the first resulting "Training Shoes". 
     WebElement mouse_hover_shoes = driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
     act.moveToElement(mouse_hover_shoes).perform();
     driver.findElement(By.xpath("//div[@class ='clearfix row-disc']/div")).click();
    //13. Print the cost and the discount percentage. 
     System.out.println("cost =  " + driver.findElement(By.xpath("(//div[@class ='product-price pdp-e-i-PAY-l clearfix']/span)[1]")).getText());
     System.out.println("discount_percentage = " + driver.findElement(By.xpath("(//div[@class ='product-price pdp-e-i-PAY-l clearfix']/span)[2]")).getText());
    //14. Take a snapshot of the shoes. 
     File source =driver.getScreenshotAs(OutputType.FILE);
     File destination = new File("/D:\\TestLeaf\\Selenium\\src\\main\\java\\week5\\day2\\Snapscreenshot\\img.png");
     FileUtils.copyFile(source, destination);
     
      driver.close();
      
	
	
	}
	
	
     
     
      
    	
	
	
	}


