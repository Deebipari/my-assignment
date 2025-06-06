package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
		
		//load url
		driver.get("https://finance.yahoo.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//mouse hover the more option and click the crypto tab
		WebElement hover=driver.findElement(By.className("_yb_98mz12"));
		
		//instantiating action class
		Actions act=new Actions(driver);
		act.moveToElement(hover).perform();
		
		//click crypto tab
		WebElement crypto=driver.findElement(By.xpath("(//a[text()='Crypto '])[3]"));
		act.click(crypto).perform();
		
		
		//Identify the table in the dom using <table> tag (//table) 
		WebElement tables=driver.findElement(By.xpath("//div[@class='tableContainer yf-j24h8w']"));

		//finding the size of row
		List<WebElement> rowCount=driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr"));
		int size=rowCount.size();
		System.out.println("Total size of row : "+size);
		
		//finding the size of column 
		List<WebElement> colCount=driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/thead/tr/th"));
		int value=colCount.size();
		System.out.println("Total size of column : "+value);
		
		//print the crypto currency names
		List<WebElement> cryptoCurrencyName=driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr/td[2]"));
		for (WebElement names : cryptoCurrencyName) {
			System.out.println(names.getText());
		}

				}


	}


