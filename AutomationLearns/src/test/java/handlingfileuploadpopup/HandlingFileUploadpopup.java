package handlingfileuploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFileUploadpopup {
	public static void main(String[] args) {
		//uploading file from window
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\AMGIRI\\Downloads\\Topics-list.txt");
	}
}
