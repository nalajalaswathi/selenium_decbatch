package WebDriverEX;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollpage {

			public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		   driver.get("http://testingmasters.com/");
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(100,10000)");
	}
}
