package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaputScreenAt_Location {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		WebElement Login_Button=driver.findElement(By.xpath("(//div[contains(.,'Log In')])[6]"));
		WebElement page=driver.findElement(By.tagName("body"));
		WebElement Form=driver.findElement(By.xpath("//div[contains(@class,'gr27e  ')]"));
		
		
		//Capturing screen and converted into file format
		File src=Login_Button.getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("screens"));
		FileHandler.copy(src, new File("screens\\Button.png"));
		
		File src1=page.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("screens\\page.png"));
		
		File src2=Form.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("screens\\form.png"));


	}

}
