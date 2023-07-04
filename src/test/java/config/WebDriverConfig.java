package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/local.properties",
        "classpath:config/remote.properties"
})
public interface WebDriverConfig extends Config {
    @Key("browserName")
    @DefaultValue("CHROME")
    String getBrowserName();
    @Key("browserVersion")
    String getBrowserVersion();

    @Key("browserSize")
    String getBrowserSize();

    @Key("baseUrl")
    @DefaultValue("https://www.automationexercise.com/")
    String getBaseUrl();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean isRemote();
}
