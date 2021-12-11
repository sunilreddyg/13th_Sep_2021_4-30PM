package ui_verificationcommands;

import org.openqa.selenium.WebDriver;

import mq.java.Variables.WebDriverExample.Repository;

public class Verify_PageUrl 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver;
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		driver=obj.getdriver();
		driver.get("http://instagram.com");
		
		if(driver.getCurrentUrl().contains("https://"))
		{
			System.out.println("Secured Browser");
			
			//Nested Condition
			if(driver.getCurrentUrl().contains("instagram.com/"))
			{
				System.out.println("Url is Verified for instagram page");
			}
			else
			{
				System.out.println("Url is mismatch for instagram page");
			}
			
		}
		else
		{
			System.out.println("inSecured Browser");
		}
		
		
		

	}

}
