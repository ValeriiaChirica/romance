import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BaseActions {

    public HomePage (WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void clickJoinButton (){
        WebElement registrationButton = driver.findElement(Locators.BUTTON_REGISTRATION);
        registrationButton.click();
    }
    public void firstPartOfRegistration(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_EMAIL));
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(generateNewEmail(Data.email, 7));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(generateNewPassword(Data.password, 10));
        WebElement nextButton = driver.findElement(Locators.BUTTON_NEXT);
        nextButton.click();
    }
    public void secondPartOfRegistration() {
        WebElement nickname = driver.findElement(Locators.INPUT_NICKNAME);
        nickname.sendKeys(generateNewNickname(Data.nickname, 6));
        WebElement daySelect = driver.findElement(Locators.SELECT_DAY);
        daySelect.click();
        driver.findElement(Locators.DAY_10).click();
        WebElement monthSelect = driver.findElement(Locators.SELECT_MONTH);
        monthSelect.click();
        driver.findElement(Locators.MONTH_MAY).click();
        WebElement yearSelect = driver.findElement(Locators.SELECT_YEAR);
        yearSelect.click();
        driver.findElement(Locators.YEAR_1943).click();
        WebElement phoneNumber = driver.findElement(Locators.INPUT_PHONE_NUMBER);
        phoneNumber.sendKeys(generateNewPhoneNumber(Data.number,9));
        WebElement location = driver.findElement(Locators.INPUT_LOCATION);
        location.sendKeys("lviv");
        wait.until(ExpectedConditions.textToBe(Locators.DROP_DOWN_REGION_LVIV, "Lviv, Ukraine"));
        WebElement locationLviv = driver.findElement(Locators.DROP_DOWN_REGION_LVIV);
        locationLviv.click();
        WebElement checkBoxOnForRegistration = driver.findElement(Locators.CHECK_BOX_ON_REGISTRATION);
        checkBoxOnForRegistration.click();
        if (checkBoxOnForRegistration.isSelected()) {
            System.out.println("Check Box is selected");
        }
    }
    public void clickYouTubeButton (){
        WebElement ele = driver.findElement(Locators.IFRAME_ELE);
        driver.switchTo().frame(ele);
        WebElement youTubePlay = driver.findElement(Locators.BUTTON_YOU_TUBE);
        youTubePlay.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if (youTubePlay.isEnabled()) {
            System.out.println("VIDEO IS PLAYING");
        }
    }
    public void clickPrettyWomen (){
        driver.findElement(Locators.LINK_PRETTY_WOMEN).click();
    }
    public void clickGifts(){
        driver.findElement(Locators.LINK_GIFT).click();
    }
    public void clickHowItWorks(){
        driver.findElement(Locators.LINK_HOW_IT_WORKS).click();
    }
    public void clickPhoto(){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(Locators.LINK_PHOTOS).click();
    }
    public void clickSignIn(){
        driver.findElement(Locators.LINK_SIGN_IN).click();
    }
    public void enterEmailPasswordToSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_EMAIL_SIGN_IN));
        driver.findElement(Locators.TEXT_FIELD_EMAIL_SIGN_IN).sendKeys(Data.emailSignInValues);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD_SIGN_IN).sendKeys(Data.passwordSignInValues);
        driver.findElement(Locators.BUTTON_SUBMIT).click();
    }
    public void clickTourToUkraine(){
        driver.findElement(Locators.LINK_TOUR_TO_UKR).click();
    }
    public void clickBlog(){
        driver.findElement(Locators.LINK_BLOG).click();
    }

}
