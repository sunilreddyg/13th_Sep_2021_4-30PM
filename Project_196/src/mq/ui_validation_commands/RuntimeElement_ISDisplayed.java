package ui_validation_commands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RuntimeElement_ISDisplayed
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://www.cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(5000);
		
		
		WebElement Morelinks=driver.findElement(By.xpath("//a[contains(.,'More options: Class of travel, Airline preference')]"));
		Morelinks.click();
		Thread.sleep(2000);
		
		
		WebElement  ClassOftravel=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[4]"));
		if(ClassOftravel.isDisplayed())
			System.out.println("Expected Dropdown visible at webpage");
		else
			System.out.println("Expected Droddown not visible at webpage");
		
	}

}
