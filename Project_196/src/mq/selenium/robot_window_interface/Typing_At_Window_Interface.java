package robot_window_interface;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Typing_At_Window_Interface 
{

	public static void main(String[] args) throws Exception 
	{
		
		//launch notepad at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Type Hello
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_Q);

	}

}
