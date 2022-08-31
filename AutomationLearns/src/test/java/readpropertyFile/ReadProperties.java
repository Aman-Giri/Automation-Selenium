package readpropertyFile;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\AMGIRI\\git\\Automation-Selenium\\AutomationLearns\\src\\test\\java\\readpropertyFile\\config.properties");
		
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		
	}
}
