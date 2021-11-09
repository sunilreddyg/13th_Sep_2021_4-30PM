package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) 
	{
		/*
		 * Download chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down a page until receive Browsers
		 * 		=> Click  to open list of browser drivers
		 * 		=> under Chrome browser click on documentation link
		 * 		=> Check what version of chrome browser is installed
		 * 	
		 * 					Open ChromeBrowser --> click on settings
		 * 					---> Help Menu----> About google chrome
		 * 		=> Click on chromedriver version w.r.t chrome browser versino
		 * 		=> Select required operating system and click  on download
		 * 		=> After download unzip file to back location
		 * 		=> After unzip you receive .exe file then set up
		 * 			environment variable for chromedriver.exe file..
		 * 
		 */
		
		//Setting runtime environment variable for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		
		//Launching browser and stroring into reference class
		ChromeDriver obj=new ChromeDriver();
		
		//load webpage into browser window
		obj.get("http://facebook.com");
		
		
		//printing title of the page
		System.out.println(obj.getTitle());
		
		//Close browser window
		obj.close();
	}

}
