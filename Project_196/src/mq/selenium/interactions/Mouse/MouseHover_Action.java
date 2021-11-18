package mq.selenium.interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Action {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		WebElement Account=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		new Actions(driver).moveToElement(Account).perform();
		
		
		WebElement Create_list=driver.findElement(By.xpath("//span[contains(.,'Create a List')]"));
		new Actions(driver).click(Create_list).perform();
		
	}

}
