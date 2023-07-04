package config;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.Map;


public class WebDriverProvider  {
    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void configure() {
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowserName();
        Configuration.browser = config.getBrowserVersion();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.pageLoadStrategy = "eager";
        if(config.isRemote()){
            Configuration.remote = config.getRemoteUrl();


        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }


}
