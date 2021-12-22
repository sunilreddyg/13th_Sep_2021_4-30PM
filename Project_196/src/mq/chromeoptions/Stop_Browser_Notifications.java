package chromeoptions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Stop_Browser_Notifications {

	public static void main(String[] args) {
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
	}

}
