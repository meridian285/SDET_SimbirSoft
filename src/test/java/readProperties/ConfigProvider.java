package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * Interface for interacting with the application.conf file
 */
public interface ConfigProvider {
    static Config readConfig() {
        return ConfigFactory.load("application.conf");
    }
    //url to run the test
    String URL = readConfig().getString("url");
    //valid login credentials
    String USER_LOGIN = readConfig().getString("userParams.user.login");
    String USER_PASSWORD = readConfig().getString("userParams.user.password");
    //invalid login credentials
    String INVALID_USER_LOGIN = readConfig().getString("userParams.invalidUser.login");
    String INVALID_USER_PASSWORD = readConfig().getString("userParams.invalidUser.password");
    //valid credentials for order verification
    String FIRST_NAME = readConfig().getString("dataForChecks.checkoutYourInformation.firstName");
    String LAST_NAME = readConfig().getString("dataForChecks.checkoutYourInformation.lastName");
    String POSTAL_CODE = readConfig().getString("dataForChecks.checkoutYourInformation.postalCod");
    //data for order completion checks
    String URL_COMPLETED_ORDER = readConfig().getString("dataForChecks.verifySuccessfulPurchase.urlCompletedPage");
    String MESSAGE_COMPLETED_ORDER = readConfig().getString("dataForChecks.verifySuccessfulPurchase.messageCompletedPage");
}
