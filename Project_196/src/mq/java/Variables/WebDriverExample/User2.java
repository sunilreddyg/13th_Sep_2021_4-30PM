package mq.java.Variables.WebDriverExample;

import org.openqa.selenium.WebDriver;

public class User2 
{
	
	static WebDriver driver;

	public static void main(String[] args) 
	{
		Repository obj=new Repository();
		obj.OpenChrome();
		driver=obj.getdriver();   //Assigning other class driver to Current Class webdriver
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		
		obj.userlogin("Admin", "admin123");
		driver.close();

	}

}
