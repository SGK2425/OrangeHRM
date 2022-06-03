package sample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {
	
	WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/gopikrishnasettipalli/Automation_Projects/HRMProject/src/test/resources/Browser/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSkills");
		
	}
	 
	 
		
	
	
	

}
