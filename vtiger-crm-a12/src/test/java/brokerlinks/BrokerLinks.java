package brokerlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokerLinks {
	@Test
	public void checkBrokenLinks() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.flipkart.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (WebElement i : links) {
			System.out.println(i.getText());
			String urlvalue = i.getAttribute("href");

			URL url = new URL(urlvalue);

			try {
				URLConnection conn = url.openConnection();

				HttpURLConnection httpConn = (HttpURLConnection) conn;
				httpConn.connect();
				int code = httpConn.getResponseCode();

				if (code < 300) {
					System.out.println("Passed");
				}
			} 
			catch (Exception e) {
				System.out.println("The given url " + url + " is broken...");
			}
		}

		driver.quit();
	}
}