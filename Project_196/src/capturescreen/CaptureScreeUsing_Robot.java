package capturescreen;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CaptureScreeUsing_Robot {

	public static void main(String[] args) throws Exception
	{
		
		
		//Get default system screen size
		Dimension ScreenDimension=Toolkit.getDefaultToolkit().getScreenSize();
		
		//Create screen shot using Default Screen Dimension
		Robot robot=new Robot();
		BufferedImage image=robot.createScreenCapture(new Rectangle(ScreenDimension));
		
		//Write image into local files
		ImageIO.write(image, "PNG", new File("D:\\images\\image1.png"));
		
		

	}

}
