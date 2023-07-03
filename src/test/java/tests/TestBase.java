package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class TestBase {
    @BeforeAll
    static void beforeAll () {
//        String selenoidUrl = System.getProperty("selenoid_url");
//        String selenoidLoginPassword = System.getProperty("selenoid_login_password"); //format is {login}:{password}
//        selenoidUrl = selenoidUrl.replaceAll("https://", "");
        //Configuration.remote = "https://" + selenoidLoginPassword + "@" + selenoidUrl;
        Configuration.pageLoadStrategy = "eager";


        String[] browser = System.getProperty("browser", "chrome:100.0").split(":");
        Configuration.browser = browser[0];
        Configuration.browserVersion = browser[1];

        Configuration.browserSize = System.getProperty("browser_size", "1920x1080");


        DesiredCapabilities capabilities = new DesiredCapabilities();
        Map<String, Object> prop = new HashMap<>();
        prop.put("enableVNC", true);
        prop.put("enableVideo", true);

        capabilities.setCapability("selenoid:options", prop);

        Configuration.browserCapabilities = capabilities;

        SelenideLogger.addListener("allure",new AllureSelenide());

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-notifications");
    }
    @AfterAll
    static void addAttachments(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}


