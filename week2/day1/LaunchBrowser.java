package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate the browser driver
		
				ChromeDriver driver = new ChromeDriver();
				
				// load URL
				driver.get("https://www.facebook.com/");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//get title of the page
				String title=driver.getTitle();
				System.out.println(title);
				
				//close the browser
				driver.close();

	}

}
