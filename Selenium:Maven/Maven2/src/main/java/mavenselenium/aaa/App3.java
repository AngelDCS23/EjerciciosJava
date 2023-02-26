package mavenselenium.aaa;

import org.openqa.selenium.By;
import java.util.Scanner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App3 {

	public static void main(String[] args) {
		try {

			System.setProperty("webdriver.chrome.driver", "/Users/angeldecarasalas/Downloads/chromedriver");
																							
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.digitechfp.com");
			System.out.println("Pulsa cualquier tecla para cerrar ");
			driver.quit();
		} catch (Exception e) {
			System.out.println("Ocurrió un error: " + e.getMessage());
		}
	}
}