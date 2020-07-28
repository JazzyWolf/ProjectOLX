package utils.pages;

import org.openqa.selenium.By;
import utils.functions.CommonFunctions;

public class PageElements extends CommonFunctions {
    public static By homePage = By.xpath("//div[@class=\"maincategories\"]");
    public static By btnAcceptCookies = By.xpath("//div[@id='cookiesBar']/button[@class='cookie-close abs cookiesBarClose']");
    public static By imobiliarePage = By.xpath("//a[@data-id='3']/span[text()='Imobiliare']");
    public static By categoryApartamenteDeVanzare = By.xpath("//*[@id='bottom3']/ul/li[1]/a");
    public static By category3Rooms = By.xpath("//div[@id='topLink']/div/ul[3]/li[1]/a");
    public static By inputLocation = By.id("cityField");
    public static By promotedAnunturi = By.xpath("//td[@class=\"offer promoted \"]/div/table/tbody/tr/td/a");
    private static By apartmentPrice = By.xpath("//div[@class=\"offer-titlebox__price\"]/div[@class=\"pricelabel\"]/strong");
    private static By squareMeters = By.xpath("//span[@class=\"offer-details__param\"]/strong[@class=\"offer-details__value\"]");
    public static By firstAd = By.xpath("//html/body/div[3]/div[3]/section/div[3]/div/div[1]/table[1]/tbody/tr[2]/td/div/table/tbody/tr[1]/td[2]/div/h3/a");

    public static String getPrice() {
        String price = driver.findElement(apartmentPrice).getText().replaceAll("[^.0123456789]","");
        System.out.println("Price of this apartment is " + price + " Euros");
        return price;
    }

    public static String getSquareMeters() {
        String sm = driver.findElement(squareMeters).getText().replaceAll("[^.0123456789]","");
        System.out.println("Square meters of this apartment is " + sm + " square meters");
        return sm;
    }

}
