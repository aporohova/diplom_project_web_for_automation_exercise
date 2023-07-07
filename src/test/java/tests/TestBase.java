package tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
public class TestBase {
    @BeforeAll
    static void setup() {
        WebDriverProvider.config();
        Configuration.pageLoadStrategy = "eager";
        Configuration.pageLoadTimeout = 100000;
        Configuration.timeout = 15000;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        Map<String, Object> prop = new HashMap<>();
        prop.put("enableVNC", true);
        prop.put("enableVideo", true);

        capabilities.setCapability("selenoid:options", prop);

        Configuration.browserCapabilities = capabilities;

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", true));
//        Configuration.browserCapabilities = capabilities;
    }
        @BeforeEach
        void addAllure () {
            SelenideLogger.addListener("allure", new AllureSelenide());
        }

        @AfterAll //change to AfterEach
         static void addAttachments () {
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();
            Selenide.closeWebDriver();
        }
    }

