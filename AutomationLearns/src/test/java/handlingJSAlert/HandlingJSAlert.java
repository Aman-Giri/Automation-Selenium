package handlingJSAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingJSAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/"); //launch webssite
		driver.manage().window().maximize(); // maximise the window
		//it will popup a javascript alert
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click(); //click on signin btn
		driver.findElement(By.xpath("//input[@title='Sign in']")).click(); //click on sign in button
		
		Thread.sleep(3000);
		
		//switch on alert window and print the alert text
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		
		
		//Validation Points
		if(alerttext.equals("Please enter a valid user name")) {
			System.out.println("correct messg");
		}else {
			System.out.println("incorrect messg");
		}
		
		alert.accept();
		//alert.dismiss(); -- for cancel the alert popup
		
		driver.quit();
		
		
	}

}
