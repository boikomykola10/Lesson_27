import com.codeborne.selenide.CollectionCondition.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.*;

public class Lesson27 {

    @BeforeMethod
    public void before() {
        Configuration.browserSize = "1200x900";
        Configuration.timeout = 5000;
        open("https://rozetka.com.ua/");
    }

    @Test
    public void testSelenide() {

        String currentUrl = url();
        System.out.println(currentUrl);

        String source = source();
        System.out.println(source);



        /*SelenideElement loginBtn = $(withText("Увійдіть в особистий кабінет"));
        loginBtn.click();
        sleep(5000);*/
        // операції з колекціями елементів
        /*ElementsCollection categoryList = $$(By.xpath("//a[@class='menu-categories__link']"));
        ElementsCollection categoryListFilter = categoryList.filterBy(text("Смартфони, ТВ і електроніка"));
        System.out.println(categoryListFilter.size());*/

        /*String text = categoryList.get(1).getText();
        System.out.println(text);*/

        //первірка розміру колекції
        /*int sizeCollection = categoryList.size();
        System.out.println(sizeCollection);
        categoryList.shouldHave(CollectionCondition.size(16));*/
    }

}
