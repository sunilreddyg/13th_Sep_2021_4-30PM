package switch_commands.Windows;


import java.util.Iterator;
import java.util.Set;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception
	{
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    String MainWindowID=driver.getWindowHandle();
	    System.out.println(MainWindowID);
	  
	 
	    //Click On Hyperlink to pen Page at New window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(5000);
	    
	    
	    //Get All Window ID
	    Set<String>  AllWindowIDs=driver.getWindowHandles();
	   
	    //Convert Set of String value into iterators
	    Iterator<String> itr=AllWindowIDs.iterator();

	    //using Next Keyword get Access Each iterator
	    String W1=itr.next();
	    String W2=itr.next();
	    
	    //Switch to Instagram Blog window
	    driver.switchTo().window(W2);
	    System.out.println("W2 Title is ---> "+driver.getTitle());
	    
	    //GetControl Back to Mainwindow
	    driver.switchTo().window(W1);
	    System.out.println("MainWindow Title is ---> "+driver.getTitle());
	}

}
