package pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private ElementsCollection menu = $$(By.xpath("//ul[@class='nav navbar-nav']/li//*"));
    private SelenideElement
            email = $("#susbscribe_email"),
            notification = $(".alert-success"),
            categoryVideo = $(".fa-youtube-play");

    public MainPage openPage() {
        open("/");

        return this;
    }

    public MainPage checkMenu(List value) {
        menu.shouldHave(CollectionCondition.containExactTextsCaseSensitive(value));

        return this;
    }

    public MainPage enterEmail(String value) {
        email.setValue(value).pressEnter();

        return this;
    }

    public MainPage checkNotification(String value) {
        notification.shouldHave(Condition.text(value));

        return this;
    }

    public MainPage selectVideoCategory() {
        categoryVideo.click();

        return this;
    }

    public MainPage switchTo(String value) {
        Selenide.switchTo().window(0).getCurrentUrl().equals(value);

        return this;
    }
}
