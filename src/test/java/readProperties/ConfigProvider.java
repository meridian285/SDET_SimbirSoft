package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * Интерфейс для взаимодействия с файлом application.conf
 */
public interface ConfigProvider {

    static Config readConfig() {
        return ConfigFactory.load("application.conf");
    }

    String URL = readConfig().getString("url");
    String USER_LOGIN = readConfig().getString("userParams.user.login");
    String USER_PASSWORD = readConfig().getString("userParams.user.password");
}
