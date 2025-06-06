package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomatingFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setup ChromeDriver
    	ChromeOptions option =new ChromeOptions();
    	option.addArguments("--guest");
    	
        WebDriver driver = new ChromeDriver(option);
        //load url
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // switch over to frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[(text()='Try it')]")).click();
		//handle alert
		Alert alert = driver.switchTo().alert();
    	System.out.println(alert.getText());
		alert.accept();
       	System.out.println(driver.findElement(By.xpath("//p[text()= 'You pressed OK!']")).getText());
       	
       
       	
       	
       
	}

}
