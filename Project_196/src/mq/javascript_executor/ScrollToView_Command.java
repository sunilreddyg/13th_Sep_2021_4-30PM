package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToView_Command {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//Enabling javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Identify element pass Javascript Action on Element
		WebElement Element=driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
		js.executeScript("arguments[0].scrollIntoView()", Element);
	}

}
