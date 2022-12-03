import org.openqa.selenium.By;

public class Locators {
    //Current title of the page
    public static final By CURRENT_TITLE = By.xpath("//h1");
    //Blog page
    public static final  By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    //Gift page
    public static final By INPUT_SEARCH = By.xpath("//input[@id='search_product']");
    public static final By BUTTON_SEARCH = By.xpath("//button[@id='search_friend']");
    public static final By LINK_GIFT = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    public static final By BEAR_TITLE = By.cssSelector(".title-block.pt5");
    //How it works page
    public static final By LINK_HOW_IT_WORKS = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    //Photo page
    public static final By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    //Pretty women page
    public static final By LINK_PRETTY_WOMEN = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    //Registration
    public static final By BUTTON_REGISTRATION = By.cssSelector("#show-registration-block");
    public static final By TEXT_FIELD_EMAIL = By.xpath("//input[@id='email']");
    public static final By TEXT_FIELD_PASSWORD = By.xpath("//input[@id='password']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    //Sign in page
    public static final By LINK_SIGN_IN = By.cssSelector("#ajax_login_link");
    public static final By TEXT_FIELD_EMAIL_SIGN_IN = By.xpath("//input[@type='text'][@id='email']");
    public static final By TEXT_FIELD_PASSWORD_SIGN_IN = By.xpath("//input[@id='password'][@name='password']");
    public static final  By BUTTON_SUBMIT = By.xpath("//button[@type='submit']");
    //Tour to Ukr page
    public static final  By LINK_TOUR_TO_UKR = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");




}
