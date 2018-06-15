package selenium.partone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class launchIE {

	public launchIE() {
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Ethan Hunt\\Desktop\\Automation Class\\IEDriverServer_Win32_3.12.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
	}

}
