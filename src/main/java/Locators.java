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
    public static final By ALBUM_TYPE = By.xpath("//select[@id='album_id']");
    public static final By COMMENT_COUNT = By.xpath("//div/*[@class='g-flatty-block__control form-inline']//span[@class='form-group']//select");

    public static final By SORT_BY_PHOTOS = By.xpath("//*[@id='gallery_media_sorter']//select[@class='form-control']");
    //Pretty women page
    public static final By LINK_PRETTY_WOMEN = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By MIN_AGE_DROP_DOWN_LIST = By.cssSelector("#age_min");
    public static final By MAX_AGE_DROP_DOWN_LIST = By.cssSelector("#age_max");
    public static final By BUTTON_SEARCH_AGES = By.cssSelector("#main_search_button_user_advanced");
    public static final By COUNT_OF_ACCOUNTS = By.cssSelector(".st-info");
    //Registration
    public static final By BUTTON_REGISTRATION = By.cssSelector("#show-registration-block");
    public static final By TEXT_FIELD_EMAIL = By.xpath("//input[@id='email']");
    public static final By TEXT_FIELD_PASSWORD = By.xpath("//input[@id='password']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By INPUT_NICKNAME= By.xpath("//*[@id='nickname']");
    public static final By INPUT_PHONE_NUMBER = By.xpath("//input[@name='data[phone]']");
    public static final By INPUT_LOCATION = By.xpath("//input[@name='region_name']");
    public static final By DROP_DOWN_REGION_LVIV = By.xpath("//ul//li[@country='UA']");
    public static final By CHECK_BOX_ON_REGISTRATION = By.xpath("//input[@data-field='confirmation']");
    public static final By DAY_10 = By.xpath("//ul[@class='dropdown-menu show']//a[contains (text(), '10')] ");
    public static final By MONTH_MAY = By.xpath("//ul[@class='dropdown-menu show']//a[contains (text(), 'May')] ");
    public static final By YEAR_1943 = By.xpath("//ul[@class='dropdown-menu show']//a[contains (text(), '1943')]");
    public static final By SELECT_DAY = By.cssSelector("#daySelect");
    public static final By SELECT_MONTH = By.cssSelector("#monthSelect");
    public static final By SELECT_YEAR = By.cssSelector("#yearSelect");


    //Sign in page
    public static final By LINK_SIGN_IN = By.cssSelector("#ajax_login_link");
    public static final By TEXT_FIELD_EMAIL_SIGN_IN = By.xpath("//input[@type='text'][@id='email']");
    public static final By TEXT_FIELD_PASSWORD_SIGN_IN = By.xpath("//input[@id='password'][@name='password']");
    public static final  By BUTTON_SUBMIT = By.xpath("//button[@type='submit']");
    //Tour to Ukr page
    public static final  By LINK_TOUR_TO_UKR = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    //Home page
    public static final  By BUTTON_YOU_TUBE = By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']");
    public static final  By IFRAME_ELE = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final  By IMG_ON_HOME_PAGE_SLIDES = By.xpath("//img[@src='/img/portfolio/slideimg4.jpg'] ");




}
