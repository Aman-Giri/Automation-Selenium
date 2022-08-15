package findElementsConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindelementsConcepts {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
		//1.get the total count of links in the page
		//2.get the text of each link on the page
		
		//all the links are represented by <a> tag : 
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		//size of the linklist ; 
		
		System.out.println(linklist.size());
		
		for(int i=0;i<linklist.size();i++) {
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
		}
	}
}
