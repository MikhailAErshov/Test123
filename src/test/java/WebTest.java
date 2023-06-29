import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
public class WebTest {
    @BeforeAll
    public static void setDriver() throws MalformedURLException {
        boolean isRemote = true;
        if (isRemote) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
            capabilities.setCapability("enableVNC:", true);
            WebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444/wd/hub").toURL(), capabilities);
            setWebDriver(driver);
        } else {
            Configuration.browser = "firefox";
        }
    }
}
