package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		EdgeDriver driver1 = new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://www.facebook.com/");
		}
	

}
