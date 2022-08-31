package elementvisibilitytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elementvisibilitytest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://classic.freecrm.com/register/"); //enter the url
		
		//1. isDisplayed() : applicable for all the elements
		boolean b1 = driver.findElement(By.xpath("//div[@class='myButton']")).isDisplayed();
		System.out.println(b1); // true
		
		//2. isenabled() :
		boolean b2 = driver.findElement(By.xpath("//div[@class='myButton']")).isEnabled();
		System.out.println(b2); //false
		
		//Select the I agree button : 
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click(); // submit button is enabled now : 
		boolean b3 = driver.findElement(By.xpath("//div[@class='myButton']")).isEnabled();
		System.out.println(b3); //true
		
		//3. Isselected() : only applicable for dropdown,checkbox,radiobutton : 
		boolean b4 = driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
		System.out.println(b4);
	}
}
