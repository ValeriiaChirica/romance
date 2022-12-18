import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BlogPage extends BaseActions {

    public BlogPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void getTitleBlog(){
        Data.currentTitle = driver.findElement(Locators.CURRENT_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitleBlog);
    }


}
