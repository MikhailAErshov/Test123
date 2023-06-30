import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class WebTest {
    @BeforeAll
    public static void setDriver() throws MalformedURLException {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.reportsFolder = "target/surefire-reports";

        Map<String, Boolean> options = new HashMap<>();
        options.put("enableVNC", true);
        options.put("enableLog", true);

        ChromeOptions capabilities = new ChromeOptions();
        capabilities.setBrowserVersion("114.0");
        Configuration.browserCapabilities = capabilities;
        Configuration.browserCapabilities.setCapability("selenoid:options", options);
    }
}
