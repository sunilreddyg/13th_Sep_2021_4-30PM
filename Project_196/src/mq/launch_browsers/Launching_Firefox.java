package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Firefox
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Download geckodriver.exe file
		 * 	    => https://www.selenium.dev/downloads/
		 * 		=> Scroll down a page until receive Browsers
		 * 		=> Click  to open list of browser drivers
		 * 		=> Under firefox click on document link
		 * 		=> Under supported platfroms findout required geckodriver
		 * 					version w.r.t firefox browser and selenium version
		 * 		=> click on geckodriver releases link
		 * 		=> Under asserts download zip format file w.r.t operating
		 * 				system and hotspot size
		 * 		=> 
		 */
		
		//Setting runtime environment variable for geckodriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		
		//launching firefox browser and storing into reference class
		FirefoxDriver firefox=new FirefoxDriver();
		
		//Load webpage to browser window
		firefox.get("http://google.com");
		
		//print title of the page
		System.out.println(firefox.getTitle());
		
		
		//Close firefox
		firefox.close();
		
	}

}
