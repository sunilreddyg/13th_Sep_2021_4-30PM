package mq.selenium.Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		/*
		 * Clear method remove text from entry box
		 */
		
		driver.findElement(By.id("email")).sendKeys("Darshan");
		driver.findElement(By.id("email")).clear();

	}

}
