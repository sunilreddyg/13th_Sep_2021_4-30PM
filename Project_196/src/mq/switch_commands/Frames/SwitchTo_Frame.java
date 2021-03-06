package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Frame 
{

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/account/trips");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    
	    driver.switchTo().frame("modal_window");

	    WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	    Email.clear();
	    Email.sendKeys("info.dsnr@gmail.com");
	    
	    
	    WebElement tripId=driver.findElement(By.id("tripidSecond"));
	    tripId.clear();
	    tripId.sendKeys("67897897");
	    
	    
	    //Get Controls back to Page
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//span[contains(.,'Your trips')]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='SignIn']")).click();
	}

}
