package config;
import com.codeborne.selenide.Configuration;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;

//package config;
//import com.codeborne.selenide.Configuration;
//import org.aeonbits.owner.ConfigFactory;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import java.util.Map;
//
//
//public class WebDriverProvider  {
//    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
//
//    public static void configure() {
//        Configuration.baseUrl = config.getBaseUrl();
//        Configuration.browser = config.getBrowserName();
//        Configuration.browserVersion = config.getBrowserVersion();
//        Configuration.browserSize = config.getBrowserSize();
//        Configuration.pageLoadStrategy = "eager";
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        if(config.isRemote()){
//            Configuration.remote = config.getRemoteUrl();
//            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                    "enableVNC", true,
//                    "enableVideo", true));
//            Configuration.browserCapabilities =capabilities;
//
//
//        }
//
//        //DesiredCapabilities capabilities = new DesiredCapabilities();
////        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
////                "enableVNC", true,
////                "enableVideo", true
////        ));
//       //Configuration.browserCapabilities = capabilities;
//    }
//
//
//}
public class WebDriverProvider {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void config() {
        Configuration.browser = config.getBrowserName().toLowerCase();
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.remote = config.getRemoteUrl();
        Configuration.browserSize = config.getBrowserSize();
    }
}