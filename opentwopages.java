package selenium.partone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opentwopages {

	public opentwopages() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ethan Hunt\\Desktop\\Automation Class\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.bankofamerica.com";
		driver.get(baseUrl);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"navCheckingMobile\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"open-now-core-checking\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"whyAddSavingsAccount\"]")).click();

		try {

			Thread.sleep(10000);
			} catch (InterruptedException e) {
				System.out.println("Got an error while processing");
			}
			driver.close();
		}

}
