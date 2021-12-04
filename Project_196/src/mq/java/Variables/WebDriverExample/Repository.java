package mq.java.Variables.WebDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Repository 
{
	
	String chrome_path="C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe";
	WebDriver driver;
	
	public void OpenChrome()
	{
		System.setProperty("webdriver.chrome.driver", chrome_path);
		driver=new ChromeDriver();
	}
	
	public void LaunchBrowser(String Browsername)
	{
		switch (Browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;

		default: System.out.println("browsername is mismatched");
			break;
		}
	}
	
	
	public WebDriver getdriver()
	{
		return driver;
	}
	
	public void userlogin(String UID, String PWD)
	{
		driver.findElement(By.xpath(CommonObjects.loginEmail)).sendKeys(UID);
		driver.findElement(By.xpath(CommonObjects.loginPassword)).sendKeys(PWD);
		driver.findElement(By.xpath(CommonObjects.loginSubmitButton)).click();
	}
	
	

}
