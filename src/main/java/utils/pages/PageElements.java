package utils.pages;

import org.openqa.selenium.By;

public class PageElements {

    public static By homePage = By.xpath("//div[@class=\"maincategories\"]");
    public static By imobiliarePage = By.xpath("a[href*='://imobiliare']");
    public static By categoryApartamenteDeInchiriat = By.xpath("//*[@id=\"bottom3\"]/ul/li[2]/a");
    public static By categoryRooms = By.id("subSelect909");
    public static By category3Rooms = By.xpath("//*[@id=\"param_subcat\"]/div[2]/ul/li[4]/a");
    public static By promotedOffersTable = By.xpath("//table[@class=\"fixed offers breakword offers--top redesigned\"]");
    public static By offersTable = By.id("offers_table");
}
