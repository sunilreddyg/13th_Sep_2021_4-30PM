package mq.selenium.Datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker_Month_And_Year {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("	https://jqueryui.com/datepicker/#dropdown-month-year");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(1000);
		
		new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")))
		.selectByVisibleText("May");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("28")).click();
		
		
	}

}
