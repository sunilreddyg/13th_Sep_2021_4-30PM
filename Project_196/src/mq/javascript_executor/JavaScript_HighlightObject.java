package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_HighlightObject 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//Enablign javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Selecting background color to selected object
		WebElement Element=driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
		js.executeScript("arguments[0].scrollIntoView()", Element);
		js.executeScript("arguments[0].style.backgroundColor = 'yellow'", Element);

	   //Setting outline property to selected object
		WebElement Element1=driver.findElement(By.xpath("//a[@href='/login/']"));
		js.executeScript("arguments[0].style.outline ='thick solid red'", Element1);
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		
	}

}
