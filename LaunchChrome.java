package selenium.partone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public LaunchChrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ethan Hunt\\Desktop\\Automation Class\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}
