package WebDriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/register");
		
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Testing Masters");
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Testing Masters");
		driver.findElement(By.cssSelector("input[id='FirstName'][name='FirstName']")).sendKeys("Testing Masters");
		driver.findElement(By.cssSelector("input.text-box[id='FirstName']")).sendKeys("Testing Masters");
			
		driver.findElement(By.cssSelector("input[id^='First']")).sendKeys("Testing Masters");
		driver.findElement(By.cssSelector("input[id$='Name']")).sendKeys("Testing Masters");
		driver.findElement(By.cssSelector("input[id*='irst']")).sendKeys("Testing Masters");
		
		WebElement ele=driver.findElement(By.cssSelector("select[name='DateOfBirthDay']"));
		new Select(ele).selectByIndex(3);		
	    }
}







