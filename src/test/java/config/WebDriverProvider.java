package config;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
public class WebDriverProvider {
    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    public static void config() {
        Configuration.browser = config.getBrowserName().toLowerCase();
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.remote = config.getRemoteUrl();
    }
}