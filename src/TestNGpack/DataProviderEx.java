package TestNGpack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderEx {

	WebDriver driver;

    @BeforeClass
    public void LaunchApp(){    
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://google.com");
         }

    @Test(dataProvider="googlesearch")
    public void SearchMethod(String author,String searchKey) throws InterruptedException{
          
            WebElement searchText = driver.findElement(By.name("q"));	  
            
            searchText.sendKeys(searchKey);         
            Thread.sleep(3000);
            String testValue = searchText.getAttribute("value"); 
            searchText.clear();	           

            Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));     
    }

    @DataProvider(name="googlesearch")

    public Object[][] getDataFromDataprovider(){

        return new Object[][] {

                { "tmasters1", "India" },

                { "tmasters2", "USA" },
                
                { "tmasters3", "UK" } 
            };
    }    
}

