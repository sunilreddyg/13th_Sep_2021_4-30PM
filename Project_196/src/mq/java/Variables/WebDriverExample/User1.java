package mq.java.Variables.WebDriverExample;

import org.openqa.selenium.WebDriver;

public class User1
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		Repository obj=new Repository();
		obj.OpenChrome();
		driver=obj.getdriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		
		obj.userlogin("Admin", "admin123");
	}

}
