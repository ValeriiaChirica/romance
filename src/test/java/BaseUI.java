import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
public class BaseUI {

    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://romanceabroad.com";
    HomePage homePage;
    PrettyWomenPage prettyWomenPage;
    GiftsPage giftsPage;
    HowItWorksPage howItWorksPage;
    PhotoPage photoPage;
    TourToUkrainePage tourToUkrainePage;
    BlogPage blogPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        homePage = new HomePage(driver, wait);
        prettyWomenPage = new PrettyWomenPage(driver, wait);
        giftsPage = new GiftsPage(driver, wait);
        howItWorksPage = new HowItWorksPage(driver, wait);
        photoPage = new PhotoPage(driver, wait);
        tourToUkrainePage = new TourToUkrainePage(driver, wait);
        blogPage = new BlogPage(driver,wait);
        driver.manage().window().maximize();
        driver.get(mainUrl);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));


    }

    @AfterMethod
    public void afterActions(){
        driver.quit();
    }



}
