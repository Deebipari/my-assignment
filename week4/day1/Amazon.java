package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver = new ChromeDriver();
       
      driver.get("https://www.amazon.in/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phone");
       driver.findElement(By.id("nav-search-submit-button")).click();
       List<WebElement> price = driver.findElements(By.xpath("//div[@class='a-row']//span[@class='a-price']//span[@aria-hidden='true']//span[@class='a-price-whole']"));
       List<Integer> list=new ArrayList<Integer>();
	 for (WebElement each : price) {
			String text = each.getText();
			System.out.println(text);
			String replaceAll = text.replaceAll(",", "");
			
			int phone = Integer.parseInt(replaceAll);
			
			list.add(phone);
		}
		Collections.sort(list);
		System.out.println(list);
    
		
		
            
		}
		}


