package selenium.partone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public LaunchFirefox() {
	}

	public static void main(String[] args) {


	System.setProperty("webdriver.gecko.driver","C:\\Users\\Ethan Hunt\\Desktop\\Automation Class\\geckodriver-v0.20.1-win32\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	}

}
