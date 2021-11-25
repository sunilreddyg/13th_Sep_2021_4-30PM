package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString {

	public static void main(String[] args) throws Exception {
		
		//launch notepad at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		String text="D:\\new dump\\selenium_libraries\\lib";
				
		//Selecting Required String
		StringSelection stext=new StringSelection(text);
		//Get System Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set Content to system clipboard
		clipboard.setContents(stext, stext);
		
		
		//Press Control+V using robot class
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Down key control
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

}
