package utils.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonFunctions {

    public static WebDriver driver;
    private static final String Olx_Link = "https://www.olx.ro/";

    public static void startLibrary() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get(Olx_Link);
        
    }

    public static void quitBrowser() {
        driver.quit();
    }


    public static void generalWait(By sPageElement) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(sPageElement));
    }

    public static void listAHrefElements() {
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        allLinks.get(2).click();
    }


}
