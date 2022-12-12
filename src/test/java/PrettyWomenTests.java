import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class PrettyWomenTests extends BaseUI {

    @Test
    public void prettyWomenTab() {
        driver.findElement(Locators.LINK_PRETTY_WOMEN).click();
        Data.currentTitle = driver.findElement(Locators.CURRENT_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitlePrettyWomen);
        WebElement minAgeDropDownList = driver.findElement(Locators.MIN_AGE_DROP_DOWN_LIST);
        getDropDownListByValue(minAgeDropDownList, "29");
        WebElement maxAgeDropDownList = driver.findElement(Locators.MAX_AGE_DROP_DOWN_LIST);
        getDropDownListByValue(maxAgeDropDownList, "50");
        WebElement searchButton = driver.findElement(Locators.BUTTON_SEARCH_AGES);
        searchButton.click();
        WebElement countOfAccounts = driver.findElement(Locators.COUNT_OF_ACCOUNTS);
        Data.countOfAccountsBetween29and50 = countOfAccounts.getText();
        if (countOfAccounts.isDisplayed()){
            System.out.println(Data.countOfAccountsBetween29and50);
        }
    }
}
