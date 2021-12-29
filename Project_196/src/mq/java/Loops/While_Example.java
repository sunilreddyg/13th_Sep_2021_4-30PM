package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Example 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//Print Numbers from 1 to 10 using while loop
		int i=0;
		while(i < 10)
		{
			System.out.println(i);
			i=i+1;    //Increment value after each interation
		}
		
		
		//While with false Condition
		int j=10;
		while(j < 0)
		{
			System.out.println("never Executed");
		}

		
		
		//Manage Explicit wait using while loop..
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		WebElement ReType_email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		int count=0;
		while(!ReType_email.isDisplayed())
		{
			System.out.println("Checking for visibility");
			Thread.sleep(1000);
			if(count==100)
			{
				throw new Exception("Object is not visble Verified for 20 Seconds");
			}
			count=count+1;   //Increment one value for each iteration
		}
		System.out.println("Retype Email is displayed");
		
		
		
		
		
		
		
		
		
		
		
	}

}
