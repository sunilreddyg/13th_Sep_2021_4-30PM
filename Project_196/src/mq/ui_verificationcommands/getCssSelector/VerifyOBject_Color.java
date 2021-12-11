package ui_verificationcommands.getCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyOBject_Color {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		WebElement Hotels=driver.findElement(By.xpath("//span[contains(.,'Hotels')]"));
		Hotels.click();
		
		String Exp_color_In_HEX="#111236";
		
		WebElement Hotels_BackGround=driver.findElement(By.xpath("//div[@class='HeaderTab_HeaderTab__mzg36'][contains(.,'Hotels')]"));
		String HotelsBG_Color=Hotels_BackGround.getCssValue("color");
		System.out.println("Hotels Background color displayed is --> "+HotelsBG_Color);
		//Getcssselector return color or background color in RGBA format
	
		//Color class can convert to [HEX,RGBA,RBG --etc]
		Color DefaultColor=Color.fromString(HotelsBG_Color);
		String Act_HexColor=DefaultColor.asHex();
		
		if(Exp_color_In_HEX.equals(Act_HexColor))
			System.out.println("Expected background color is displayed");
		else
			System.out.println("Expected background color not displayed");
	}

}
