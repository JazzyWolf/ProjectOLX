import org.testng.annotations.Test;
import utils.functions.CommonFunctions;
import utils.pages.PageElements;

public class FirstTest {

    @Test
    public void showSpecificAds() {
        // Step 1: Start driver and access link
        CommonFunctions.openLink();
        // Step 1.2: Accept cookies
        CommonFunctions.generalClickPageElement(PageElements.btnAcceptCookies);
        // Step 2: Navigate to Imobiliare
        CommonFunctions.generalClickPageElement(PageElements.imobiliarePage);
        // Step 3: Navigate to 'Apartamente - Garsoniere de vanzare'
        CommonFunctions.generalClickPageElement(PageElements.categoryApartamenteDeVanzare);
        // Step 4: Show only '3 camere'
        CommonFunctions.generalClickPageElement(PageElements.category3Rooms);
        // Step 5: Filter by location
        CommonFunctions.generalClickPageElement(PageElements.inputLocation);
        CommonFunctions.filterByCounty("Cluj");
        CommonFunctions.filterByCity("Cluj-Napoca");
        // Step 6: Open first ad
        CommonFunctions.quitBrowser();
    }

}
