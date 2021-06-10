package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.asm.Advice.Return;

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver InitDriver() throws IOException {

		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\klogu\\CucumberLearning\\Automation\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);

		String browsername = prop.getProperty("browser");
		String url 			= prop.getProperty("url");
		
		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\klogu\\Downloads\\chromedriver.exe");

			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\klogu\\Downloads\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.get(url);

		return driver;

	}

}
