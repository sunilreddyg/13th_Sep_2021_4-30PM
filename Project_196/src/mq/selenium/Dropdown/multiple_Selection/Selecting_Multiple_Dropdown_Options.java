package mq.selenium.Dropdown.multiple_Selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Multiple_Dropdown_Options {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		//Cliciking on select menu
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(2000);
		
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();

		//Condition accept only drodpown is multiple selection type
		if(flag==true)
		{
			Select Cntry_Selector=new Select(driver.findElement(By.id("exampleFormControlSelect2")));
			Cntry_Selector.deselectAll();   //This method only works on multiple selection dropdown
			Cntry_Selector.selectByIndex(1);
			Cntry_Selector.selectByIndex(3);
			Cntry_Selector.selectByIndex(5);
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection");
		}
		
		
		
		
	}

}
