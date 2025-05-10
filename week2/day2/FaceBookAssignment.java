package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class FaceBookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize ChromeDriver
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		WebDriver driver = new ChromeDriver();
		//- Load the URL 
		driver.get("https://en-gb.facebook.com/");
       //maximize the window
		driver.manage().window().maximize();
		//Add an implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on create account
		driver.findElement(By.linkText("Create new account")).click();
		//by xpath driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//Enter the First name
		driver.findElement(By.xpath("//input[contains(@name ,'first')]")).sendKeys("Deebika");
		driver.findElement(By.xpath("//input[contains(@name ,'last')]")).sendKeys("Murugesan");
		//Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc");
        //password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("def");
		//handling all three buttons in DOB
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select date1=new Select(date);
		date1.selectByValue("1");
				
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select month1=new Select(month);
		month1.selectByIndex(7);
				
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select year1=new Select(year);
		year1.selectByVisibleText("1999");
				
		//select the radio button in gender
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			
		//get title of the page
		String title=driver.getTitle();
				

		
		
		
		
		
		
		
		
	}

}
