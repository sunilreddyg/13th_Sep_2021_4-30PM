package mq.selenium.listitems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_List_items 
{

	public static void main(String[] args) throws Exception {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/selectmenu/default.html");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//span[@class='ui-selectmenu-text'][contains(.,'Medium')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='ui-id-5']")).click();
	

	}

}
