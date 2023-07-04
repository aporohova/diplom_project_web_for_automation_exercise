package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {
    @Key("browserWithVersion")
    @DefaultValue("chrome,114.0")
    String[] getBrowserAndVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
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
