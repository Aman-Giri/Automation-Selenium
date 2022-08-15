package takeScreenShotconcept;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotConcept {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://seanprashad.com/leetcode-patterns/");
		
		//Take a screenshot and stores as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to desired location using copyFile // method
		FileUtils.copyFile(src, new File("C:\\Study Folder\\Automation\\AutomationLearns\\src\\test\\java\\takeScreenShotconcept\\website.png"));
		
	}
}
