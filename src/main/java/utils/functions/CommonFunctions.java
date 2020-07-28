package utils.functions;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.pages.PageElements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class CommonFunctions {

    public static WebDriver driver;
    private static final String Olx_Link = "https://www.olx.ro/";
    public static final String FilePath = System.getProperty("user.dir") + File.separator + "TestData.xls";


    public static void openLink() {
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

    public static void generalClickPageElement(By pageElement) {
        generalWait(pageElement);
        driver.findElement(pageElement).click();
    }

    public static void listAllHrefElements() throws InterruptedException {
       /* List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        allLinks.get(0).click();*/
        //driver.navigate().back();
        /*List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("no of links:" +links.size());
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for(int i=0;i<links.size();i++) {
            if(!(links.get(i).getText().isEmpty()))
            {
                links.get(i).click();
                driver.navigate().back();
                links=driver.findElements(By.tagName("a"));
                js.executeScript("window.scrollBy(0,1000)");
            }
        }*/
    }

    public static void filterByCounty(String countyName) {
        By county = By.xpath("//ul[@class='column part25']/li/a/span[text()='" + countyName + "']");
        generalClickPageElement(county);
    }

    public static void filterByCity(String cityName) {
        By city = By.xpath("//a[@data-name='" + cityName + "']");
        generalClickPageElement(city);
    }

    public static void createExcelFile() throws IOException {
        Workbook wb = new HSSFWorkbook();
        FileOutputStream fileOut = new FileOutputStream(FilePath);

        Sheet sheet1 = wb.createSheet("First Sheet");

        Row row1 = sheet1.createRow((short) 0);
        row1.createCell(0).setCellValue("SM");
        row1.createCell(1).setCellValue("PRICE");
        row1.createCell(2).setCellValue("AVERAGE");

        wb.write(fileOut);
        fileOut.close();
    }

}
