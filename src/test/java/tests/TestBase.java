package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverConfig;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;


public class TestBase {

//    static void setup () {
//        WebDriverProvider.configure();
//    }

    //static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    @BeforeAll
    static void setup() {
//        Configuration.baseUrl = config.getBaseUrl();
//        Configuration.browser = config.getBrowserName();
//        Configuration.browserVersion = config.getBrowserVersion();
//        Configuration.browserSize = config.getBrowserSize();
//        Configuration.pageLoadStrategy = "eager";
//        Configuration.remote = config.getRemoteUrl();


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
        WebDriverProvider.config();
        Configuration.pageLoadStrategy = "eager";
        Configuration.pageLoadTimeout = 100000;
        Configuration.timeout = 15000;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true));

        Configuration.browserCapabilities = capabilities;
    }
        @BeforeEach
        void addAllure () {
            SelenideLogger.addListener("allure", new AllureSelenide());

        }

        @AfterEach
        void addAttachments () {
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();
            Selenide.closeWebDriver();
        }
    }

