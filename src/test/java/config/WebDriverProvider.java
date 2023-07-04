package config;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.Map;


public class WebDriverProvider  {
    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void configure() {
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browserSize = config.getBrowserSize();
        String[] browserWithVersion = config.getBrowserAndVersion();
        Configuration.browser = browserWithVersion[0];
        Configuration.browserVersion = browserWithVersion[1];
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
