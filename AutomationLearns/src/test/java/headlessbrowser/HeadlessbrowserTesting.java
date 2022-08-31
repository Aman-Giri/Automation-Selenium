package headlessbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessbrowserTesting {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new HtmlUnitDriver();
		//advantages of HtmlUnitDriver
		//1.testing is happening behind the scenes -- no browser is launched
		//2.Very fast performance of the script
		//3.not suitable for Action Classes - mousemovement , double click , drag and drop
		//4.ghostdriver or headless driver

		driver.manage().deleteAllCookies();
		
		
		driver.get("https://test.salesforce.com/");
		String webpagetitle = driver.getTitle();
		System.out.println(webpagetitle);

	}

}
