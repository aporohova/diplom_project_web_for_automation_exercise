package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class TestBase {
    @BeforeAll
    static void setup () {
        WebDriverProvider.configure();
    }
//        String selenoidUrl = System.getProperty("selenoid_url");
//        String selenoidLoginPassword = System.getProperty("selenoid_login_password"); //format is {login}:{password}
//        selenoidUrl = selenoidUrl.replaceAll("https://", "");
        //Configuration.remote = "https://" + selenoidLoginPassword + "@" + selenoidUrl;

//        Configuration.pageLoadStrategy = "eager";
//        String[] browser = System.getProperty("browser", "chrome:100.0").split(":");
//        Configuration.baseUrl = config.getBaseUrl(); //"https://www.automationexercise.com/";
//        Configuration.browser = browser[0];
//        Configuration.browserVersion = browser[1];
//
//        Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
//
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        Map<String, Object> prop = new HashMap<>();
//        prop.put("enableVNC", true);
//        prop.put("enableVideo", true);
//
//        capabilities.setCapability("selenoid:options", prop);
//
//        Configuration.browserCapabilities = capabilities;
@BeforeEach
        void addAllure(){
    SelenideLogger.addListener("allure",new AllureSelenide());

}

    @AfterEach
     void addAttachments(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }
}


