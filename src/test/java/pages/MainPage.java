package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement menu = $("div.shop-menu"),
    email = $("#susbscribe_email"),
    notification = $(".alert-success"),
    categoryVideo = $(".fa-youtube-play");

    public MainPage openPage() {
        open("https://www.automationexercise.com/");

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
    public MainPage switchTo(String value){
        Selenide.switchTo().window(0).getCurrentUrl().equals(value);

        return this;
    }
}
