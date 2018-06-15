package selenium.partone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazonwebsite {

	public OpenAmazonwebsite() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ethan Hunt\\Desktop\\Automation Class\\chromedriver_win32\\chromedriver.exe");
		String baseUrl = "Http://amazon.com";
				WebDriver driver = new ChromeDriver();
				driver.get(baseUrl);
				try {

				Thread.sleep(4000);
				} catch (InterruptedException e) {
					System.out.println("Got an error while processing");
				}
				driver.close();
	}
}