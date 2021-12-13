package ui_verificationcommands.Dropdown_Verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_MultipleSelection_Count {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Given Site url http://bridgeqsystems.com/demo.php
		 * Then click on Menu link
		 * Then Verify dropdown is a multiple selection type
		 * And Confirm selection meet with expected count as 3
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		//Clicking menu link
		WebElement Menu_link=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		Menu_link.click();
		Thread.sleep(2000);
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("Multiple Selection Status is --> "+flag);
		
		//This condition allow only selecton on multiple type
		if(flag==true)
		{
			 System.out.println("Dropdown is a multiple selection type");
			 Select Cntry_Selector=new Select(driver.findElement(By.id("exampleFormControlSelect2")));
			 Cntry_Selector.deselectAll();   //This method only works on multiple selection dropdown
			 Cntry_Selector.selectByIndex(1);
			 Cntry_Selector.selectByIndex(3);
			 Cntry_Selector.selectByIndex(5);
			 
			 //Get Dropdown selection count
			 int SelectioCount=Cntry_Selector.getAllSelectedOptions().size();
			 
			 if(SelectioCount==3)
				 System.out.println("Testpass, Meeting expectd count");
			 else
				 System.out.println("Testfail, Expected Count is  mismatch");
			 
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
	}

}
