package mq.selenium.Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CharSequence_And_KeyBoard_Shortcuts {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		//Clicking on signin button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		
		driver.findElement(By.xpath("//input[@name='loginfmt']"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='i0118']"))
		.sendKeys("Hello12345",Keys.ENTER);
		
		
	}

}
