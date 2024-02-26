package Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseJavaSelenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\New folder\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	}

}
