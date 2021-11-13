package mq.selenium.Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		WebElement OriginTextbox=driver.findElement(By.id("fsc-origin-search"));
		OriginTextbox.click();
		OriginTextbox.sendKeys(Keys.BACK_SPACE);
		OriginTextbox.sendKeys("DEL");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(.,'hi (')])[2]")).click();
		

	}

}
