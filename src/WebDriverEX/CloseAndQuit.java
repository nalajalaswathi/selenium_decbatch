package WebDriverEX;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


	public class CloseAndQuit 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("https://ljsjobs.com/");			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);			
			driver.findElement(By.xpath("//*[@id='closeDiv']/div/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("FAQ")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("FeedBack")).click();
			Thread.sleep(3000);
			
			//Get Home page window handle
			String Homepage = driver.getWindowHandle();
			
			//Get Sub browsers handles
			Set<String> allhandles = driver.getWindowHandles();
			
			for(String wndhandle: allhandles)
			{			
				//Move focus to FAQ page
				driver.switchTo().window(wndhandle);
				String pageURL = driver.getCurrentUrl();			
				
				if (pageURL.contains("FrequentlyAskedQuestions"))
				{
					System.out.println("Switched to FAQ page");	
					
					
					
					driver.close();//Close FAQ page
					break; //Exit from for loop
				}				
			}
			//Switch to Home page browser
			driver.switchTo().window(Homepage);
					
			//driver.quit(); // Close all browsers opened through webdriver
		}
	}
	
	
	
	
	
	
	
	
	



