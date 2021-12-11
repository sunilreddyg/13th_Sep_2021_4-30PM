package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import mq.java.Variables.WebDriverExample.Repository;

public class Verify_ElementPresentedAt_PageSource 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		driver=obj.getdriver();
		driver.get("http://facebook.com");
		
		
		String Pagesource=driver.getPageSource();
		
		if(Pagesource.contains("email"))
		{
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys("darshan");
		}
		else
		{
			System.out.println("Element is Not presented At Source");
		}
		
		
		
		
		
		
		

	}

}
