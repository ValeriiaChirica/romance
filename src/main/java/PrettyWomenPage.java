import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PrettyWomenPage extends BaseActions {

    public PrettyWomenPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void setMaxAndMinAge(){
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
    public void selectListView(){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(Locators.LIST_VIEW).click();

    }
    public  void sendKisses(){
        driver.findElement(Locators.SEND_MESSAGE_OPTIONS).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.SEND_KISSES)));
        driver.findElement(Locators.SEND_KISSES).click();
        if (driver.findElement(Locators.LOG_IN_OR_REGISTER).isDisplayed()){
            System.out.println("User is not registered");
        }
    }

}
