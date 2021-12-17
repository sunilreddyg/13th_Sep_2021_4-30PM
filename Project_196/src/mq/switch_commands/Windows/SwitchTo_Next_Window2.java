package switch_commands.Windows;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window2 {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    String MainWindowID=driver.getWindowHandle();
	    System.out.println(MainWindowID);
	    
	    
	    //Click On Hyperlink to pen Page at New window/TAB
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(5000);
	    
	    //Get All Window ID's
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    //Iterate for allwindows using foreach loop
	    for (String EachWindowID : AllWindowIDS) 
	    {
			driver.switchTo().window(EachWindowID);
		}
	    
	    //Here is assumption after completed loop Focus will be available at Second Window
	    System.out.println("Sub Window title is --> "+driver.getTitle());
	    
	    
	    //Switch Back to main window id
	    driver.switchTo().window(MainWindowID);
	    System.out.println("Main window id is ---> "+driver.getTitle());
	    
	    /*
	     * Note:--> Only use when two windows are opened
	     * 
	     */
	   
	    
	}

}
