package Normal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty(
//	            "webdriver.edge.driver",
//	            "C:\\Users\\User\\Desktop\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
driver.get("https://rahulshettyacademy.com/client");
	}

}
