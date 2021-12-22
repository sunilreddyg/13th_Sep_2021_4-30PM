package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		//Enabling javascript executor on automatio browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type username and password using javascript
		js.executeScript("document.getElementById('email').value='Darshan'");
		js.executeScript("document.getElementById('pass').value='Hello@123'");

		WebElement Login_Button=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		js.executeScript("arguments[0].click()", Login_Button);
	}

}
