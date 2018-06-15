package selenium.partone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toEnterUserId {

	public toEnterUserId() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ethan Hunt\\Desktop\\Automation Class\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
String baseUrl = "https://www.bankofamerica.com";
driver.get(baseUrl);
driver.manage().window().maximize();

driver.findElement(By.name("onlineId1")).sendKeys("Prem");
driver.findElement(By.name("passcode1")).sendKeys("123456");
driver.findElement(By.xpath("//*[@id=\"signIn\"]/span[1]")).click();

try {

	Thread.sleep(10000);
	} catch (InterruptedException e) {
		System.out.println("Got an error while processing");
	}
	driver.close();
	}

}
