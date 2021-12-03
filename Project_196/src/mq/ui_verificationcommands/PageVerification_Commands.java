package ui_verificationcommands;

import org.openqa.selenium.WebDriver;

import mq.java.Variables.WebDriverExample.Repository;

public class PageVerification_Commands {

	public static void main(String[] args) 
	{
		
		WebDriver driver;
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		driver=obj.getdriver();
		driver.get("http://instagram.com");
		
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println(pageUrl);
		
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		driver.close();

	}

}
