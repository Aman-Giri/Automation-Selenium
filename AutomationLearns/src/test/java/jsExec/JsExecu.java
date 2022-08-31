package jsExec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecu {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		//print the title of the page : 
		String script = "return document.title;";
		String title = (String) je.executeScript(script);
		System.out.println(title);
		
		//click on the button
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		je.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//highlight the button : 
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		je.executeScript("arguments[0].style.border = '5px solid green'", button1);
		
		//Scrolling 
		driver.navigate().to("https://www.w3schools.com/jsref/met_win_alert.asp");
		WebElement certifiedbutton = driver.findElement(By.xpath("//a[@class='w3-button w3-margin-top ws-black ws-hover-black w3-round']"));
		je.executeScript("arguments[0].scrollIntoView(true);", certifiedbutton);
	}
}
