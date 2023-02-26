package mavenselenium.aaa;

import org.openqa.selenium.By;
import java.util.Scanner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App2 {

	public static void main(String[] args) {
		try {

			System.setProperty("webdriver.chrome.driver", "/Users/angeldecarasalas/Downloads/chromedriver");
																							
			WebDriver driver = new ChromeDriver();
			driver.get("https://duckduckgo.com/");
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("cook ieConsent")));
			driver.findElement(By.name("q")).sendKeys("selenium tutorial");
			driver.findElement(By.id("search_button_homepage")).click();
			String title = driver.getTitle();
			if (title.contains("selenium tutorial")) {
				System.out.println("Test ok");
			} else {
				System.out.println("Test error");
			}
			Scanner click = new Scanner(System.in);
			System.out.println("Pulsa cualquier tecla para cerrar ");
			click.nextLine();
			driver.quit();
		} catch (Exception e) {
			System.out.println("Ocurrió un error: " + e.getMessage());
		}
	}
}