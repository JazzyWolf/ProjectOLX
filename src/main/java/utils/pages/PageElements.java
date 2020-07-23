package utils.pages;

import org.openqa.selenium.By;

public class PageElements {
    public static By btnAcceptCookies = By.xpath("//div[@id='cookiesBar']/button[@class='cookie-close abs cookiesBarClose']");
    public static By imobiliarePage = By.xpath("//a[@data-id='3']/span[text()='Imobiliare']");
    public static By categoryApartamenteDeVanzare = By.xpath("//*[@id='bottom3']/ul/li[1]/a");
    public static By category3Rooms = By.xpath("//div[@id='topLink']/div/ul[3]/li[1]/a");
    public static By inputLocation = By.id("cityField");

}
