package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mq.java.Variables.WebDriverExample.Repository;

public class Verify_Page_Title 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		driver=obj.getdriver();
		driver.get("http://instagram.com");
		
		if(driver.getTitle().equals("Instagram"))
		{
			System.out.println("Instagram page title is verified");
			WebElement Locations=driver.findElement(By.linkText("Locations"));
			Locations.click();
			
			if(driver.getTitle().contains("Locations • Instagram"))
				System.out.println("Location Page title verified");
			else
				System.out.println("Location Page title not verified");
		}
		else
		{
			System.out.println("Failed to load instagram page");
		}

	}

}
