import org.testng.annotations.Test;
public class BlogTests extends BaseUI{
    @Test
    public void blogTab() {
        homePage.clickBlog();
        blogPage.getTitleBlog();

    }
}
