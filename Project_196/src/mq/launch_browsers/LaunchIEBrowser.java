package launch_browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIEBrowser {

	public static void main(String[] args) 
	{
		
		/*
		 * Download IEDriverServer.exe file
		 * 		=> URL:--> https://www.selenium.dev/downloads/
		 * 		=> Find The internet Explorer driver server
		 * 		=> Make sure Internet Explorer driver server version
		 * 				match with selenium version.
		 * 		=> Select Hotspot size  [32 bit  or 64 bit]
		 * 		=> download zip format file
		 * 		=> After download unzip file into backup folder
		 * 		
		 * 		Additional configurations:-->
		 * 				IE browser versions:-->  8,9,10,11 --etc
		 * 				Browser zoom level should be 100
		 * 				All privacy and security setting should be disabled
		 * 				Location of Privacy and Securities:-->
		 * 						Tools ---> InternetOptions
		 * 						--> Select Security tab
		 * 						--> Uncheck protected mode..
		 * 
		 * 			=> Before launch ie browser don't forgot
		 * 				to set runtime environment variables
		 * 				
		 */
		
		
		//Setting runtime environment variabel for IEDriver
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\IEDriverServer.exe");
		
		//Launching iedriver and store into reference varaible
		InternetExplorerDriver ie=new InternetExplorerDriver();
		
		//loadwebpage to into ie window
		ie.get("http://google.com");
		
		//printing title of webpage
		System.out.println(ie.getTitle());
		
		//Close browser window
		ie.close();

	}

}
