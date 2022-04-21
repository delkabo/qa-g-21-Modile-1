package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:credentials.properties"})
public interface ProjectConfig extends Config {

    String username();

    String password();

    String identificateapp();

    String url();


}
