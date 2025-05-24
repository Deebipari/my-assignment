package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandling {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--guest");
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver(option);
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		// wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate and enter user and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//enter login
		driver.findElement(By.className("decorativeSubmit")).click();
	    //click the crm link
		driver.findElement(By.xpath("//a[contains(text() ,'CRM')]")).click();
		// - Click on the Contacts button. 
        driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		//driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]/child::a")).click();
        //click merge contacts
        driver.findElement(By.xpath("//a[contains(text(), 'Merge Contacts')]")).click();
		//driver.findElement(By.partialLinkText("Merge")).click();
		// - Click on the widget of the "From Contact". 
        driver.findElement(By.xpath("//img[@ alt = 'Lookup']")).click();
        // - Click on the second resulting contact. 
        driver.findElement(By.xpath("(//a[@class ='linktext'])[2]")).click();
        // switch control to child window
        Set<String> childwindow = driver.getWindowHandles();
        List<String> listwindow = new ArrayList<String>(childwindow);
        /*for (int i = 0; i < listwindow.size(); i++) {
			driver.switchTo().window(listwindow.get(i));
			System.out.println(driver.getTitle());
        }*/
        //navigate to child
        driver.switchTo().window(listwindow.get(1));
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a)[1]")).click();
        //navigate to parent window
        driver.switchTo().window(listwindow.get(0));
      //  System.out.println(driver.getTitle());
        //closing the pop up
        driver.findElement(By.xpath("//span[contains(@class ,'dijitDialogCloseIcon')]")).click();
       // - Click on the widget of the "To Contact". 
        driver.findElement(By.xpath("(//img[@ alt = 'Lookup'])[2]")).click();
        Set<String> childwindow2 = driver.getWindowHandles();
		List<String> listwindow2 = new ArrayList<String>(childwindow2);
		driver.switchTo().window(listwindow2.get(1));
		driver.findElement(By.xpath("(//a[contains (text(), 'DemoLBCust')])[1]")).click();
		driver.switchTo().window(listwindow.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
        //handle alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
        //get title of page
		System.out.println(driver.getTitle());
		
    
        
		
		
		

	}
}
	
