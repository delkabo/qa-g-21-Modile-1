package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${versionapp}.properties"})
public interface ProjectConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("identificateapp")
    String identificateapp();
}
