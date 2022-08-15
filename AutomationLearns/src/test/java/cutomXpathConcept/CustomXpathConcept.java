package cutomXpathConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpathConcept {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
		//Absolute Xpath not recommended because : 
		//1.performance issue
		//2.not reliable
		//3.can be changed at any time in future
		
		//driver.findElement(By.xpath("//input[@class = 'gh-tb ui-autocomplete-input']")).sendKeys("Java");	
		//driver.findElement(By.xpath("//input[@name = '_nkw']")).sendKeys("Java");
		
		driver.findElement(By.xpath("//input[contains(@name , '_nkw')]")).sendKeys("Java");
		
		//dynamic id : input
		//id = test_123;
		//id = test_232;
		//id = 123_test_t;
		//id = 342_test_t;
		
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("test");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("test");
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("test");
		
		//for links : custom Xpath
		//all the link are reprsented by a tag : 
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	}
}
