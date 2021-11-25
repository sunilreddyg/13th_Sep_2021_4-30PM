package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_CV {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Upload_button=driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
		Upload_button.click();
		
		
		String path="D:\\Sample_Resume\\3year_EXP\\MyResume.docx";
		
		//Select Path
		StringSelection spath=new StringSelection(path);
		//Copy Selected path to Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(spath, spath);
		
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Release Down keys
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
	}

}
