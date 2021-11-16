package mq.selenium.Dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingDropdown_Options {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		new Select(driver.findElement(By.name("birthday_day")))
		.selectByVisibleText("23");
		
		new Select(driver.findElement(By.name("birthday_month")))
		.selectByValue("6");
		
		
		new Select(driver.findElement(By.name("birthday_year")))
		.selectByIndex(20);
		
		
		

	}

}
