package mq.selenium.Dropdown.multiple_Selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_SelectionType {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		//Cliciking on select menu
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(2000);
		
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect1")))
		.isMultiple();
		
		System.out.println("Multiple Selection type is --> "+flag);
		
		
		boolean flag1=new Select(driver.findElement(By.id("exampleFormControlSelect2")))
		.isMultiple();
		
		System.out.println("Multiple Selection type is -->"+flag1);

	}

}
