package mq.java.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Do_While_Example 
{

	public static void main(String[] args) throws Exception
	{
		
		//Print Numbers from 1 to 10 using do while loop
		int i=0;
		do {
			System.out.println(i);
			i=i+1;
		} while (i < 10);
		
		
		//Do_while with false Condition
		int j=100;
		do {
			System.out.println(j);
		} while (j < 0);   
		
		
		
		//How to Reload page until expected page title presented
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		boolean flag=false;
		do {
			driver.get("https://www.facebook.com/reg/");
			Thread.sleep(1000);
			
			//Read page title
			String PageTitle=driver.getTitle();
			flag=PageTitle.equals("Sign up for Facebook | Facebook");
			Thread.sleep(1000);
			
		} while (flag==false);
		
		System.out.println("Expected title is presented");
		
		

	}

}
