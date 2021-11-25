package robot_window_interface;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mouse_Click_Action {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);
		
		WebElement Download_link=driver.findElement(By.xpath("(//a[@href='https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.1.0/selenium-server-4.1.0.jar'])[1]"));
		Download_link.click();
		Thread.sleep(5000);
		
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Move mouse to required coordinations
		robot.mouseMove(471, 349);
		
		//Left click action at mouse
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		

	}

}
