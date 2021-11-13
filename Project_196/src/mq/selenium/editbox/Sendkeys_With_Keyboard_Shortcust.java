package mq.selenium.Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_With_Keyboard_Shortcust {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP);
		
		
		driver.findElement(By.xpath("//input[@value='1']"))
		.sendKeys(Keys.SPACE,Keys.ARROW_RIGHT);
		
		

	}

}
