import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI{

    @Test
    public void test(){
        String fruit = "I love kiwi";

        if(fruit.contains("kiwi")){
            System.out.println("We can find our fruit");
        }else {
            System.out.println("We can't find our fruit");
        }
    }

    @Test
    public void test2(){
        String fruit = "Orange";

        if(fruit.contains("kiwi")){
            System.out.println("We can find our fruit");
        }else {
            System.out.println("We can't find our fruit");
        }
    }
    @Test
    public void test3(){
        String fruit1 = "kiwi";
        String fruit2 = "orange";

        if(fruit1.contains("kiwi")) {
            System.out.println("We can find our fruit 1");
        }
            if(fruit2.contains("orange")){
            System.out.println("We can find our fruit 2");

        }else {
            System.out.println("We can't find our fruit");
        }
    }
    @Test
    public void test4(){
        String fruit1 = "kiwi";
        String fruit2 = "kiwi";

        if(fruit1.contains("kiwi") || fruit2.contains("orange")) {
            System.out.println("We can find our fruit 1");
        }else {
            Assert.fail("We can't find our fruit");
        }
    }
    @Test
    public void test5(){
        int number = 10;

        if(number==15){
            System.out.println("I can find valid number");
        }
    }

    @Test
    public void test6(){
        int number = 10;
        int sum;

        if(number==10 +5){
            sum = 95 +100;
        }else {
            sum = 100-95;
        }
        System.out.println(sum);
    }
    @Test
    public void test7(){
        boolean requirenment = true;

        if(requirenment){
            System.out.println("Boolean is tru");
        }else {
            Assert.fail("Boolean is false");
        }
    }
    @Test
    public void test8(){
        WebElement tabSearch = driver.findElement(Locators.LINK_PRETTY_WOMEN);

        if (tabSearch.getText().contains("PRETTY WOMEN")){
            tabSearch.click();
        }else {
            Assert.fail("We can't find Pretty Women tab");
        }

    }
    @Test
    public void test9(){
        List<String> crunchifyList = new ArrayList<>(Arrays.asList("kiwi","orange","melon"));
        String element = crunchifyList.get(0);
        System.out.println(element);

    }
    @Test
    public void test10(){
        List<String> crunchifyList = new ArrayList<>(Arrays.asList("kiwi","orange","melon"));

        if(crunchifyList.contains("orange"));
        System.out.println(crunchifyList);

    }
    @Test
    public void test11(){
        List<Integer> crunchifyList = new ArrayList<>(Arrays.asList(5, 10, 19));
        int sum = crunchifyList.get(1)+crunchifyList.get(2);
        System.out.println(sum);

    }
    @Test
    public void test12(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Hi guys!!");
        }

    }

    @Test
    public void test13(){
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++){
            String info = links.get(i).getText();
            links.get(i).click();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.get(mainUrl);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        }

    }

}
