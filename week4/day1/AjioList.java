package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjioList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//- Launch the URL https://www.ajio.com/ 
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable notifications");
		//option.addArguments("headless");
	    ChromeDriver driver = new ChromeDriver(option);
	    
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		// In the search box, type as "bags" and press enter 
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
		//- To the left of the screen under "Gender" click on "Men"

        driver.findElement(By.xpath("//label[@for ='Men' and contains(@class, 'facet-linkname facet-linkname-genderfilter facet-linkname-Men')]")).click();
       // driver.findElement(By.xpath("//label[@class ='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
        // Under "Category" click "Fashion Bags" 
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
      //- Print the count of the items found. 
        WebElement text = driver.findElement(By.xpath("//strong[text() =' Items Found']"));
        System.out.println(text.getText());
        //Get the list of brand of the products displayed in the page and print the list.
        List<WebElement> brands = driver.findElements(By.className("brand"));
        List<String> list=new ArrayList<String>();
        for(WebElement each : brands)
       {
    	   
        	String text1 = each.getText();
            list.add(text1);
       }
        System.out.println(list);
	}

}
