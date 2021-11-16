package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Example {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Locations")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("India")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Delhi")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Starbucks")).click();
		Thread.sleep(2000);
	}

}
