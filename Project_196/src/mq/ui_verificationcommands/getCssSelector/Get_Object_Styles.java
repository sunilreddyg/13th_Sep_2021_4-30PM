package ui_verificationcommands.getCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Object_Styles {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		WebElement SearchFlights=driver.findElement(By.xpath("//button[contains(.,'Search flights')]"));
		
		//Get Object background color
		String BG_Color=SearchFlights.getCssValue("background-color");
		System.out.println("Background color displayed is --> "+BG_Color);
		
		//Get Font Name
		String FontName=SearchFlights.getCssValue("font-family");
		System.out.println("FontFamilty Displayed --> "+FontName);
		
		
		//Get Font Size
		String FontSize=SearchFlights.getCssValue("font-size");
		System.out.println("Font size  Displayed --> "+FontSize);
		
		

	}

}
