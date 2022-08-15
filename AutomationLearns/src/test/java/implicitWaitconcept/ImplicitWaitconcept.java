package implicitWaitconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitconcept {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // it will maximise the windows
		driver.manage().deleteAllCookies();// delete all the cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//max time webpage can take to load
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//max time elements of webpage can take to load on the webpage
	}
}
