package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${env}.properties",
})
public interface WebDriverConfig extends Config {
    @Key("browserName")
    @DefaultValue("CHROME")
    String getBrowserName();
    @Key("browserVersion")
    @DefaultValue("100")
    String getBrowserVersion();

    @Key("browserSize")
    String getBrowserSize();

    @Key("baseUrl")
    @DefaultValue("https://www.automationexercise.com/")
    String getBaseUrl();

    @Key("remoteUrl")
    String getRemoteUrl();

}
