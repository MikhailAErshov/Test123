import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.logging.LogType.DRIVER;

public class MainTest extends WebTest {

    GooglePage googlePage = new GooglePage();
    AptekaMainPage aptekaMainPage = new AptekaMainPage();
    @Test
    public void testLogin() {
        open("https://aptekaeconom.com");
        Selenide.webdriver().driver().getWebDriver().manage().addCookie(new Cookie("current_region", "103006"));
        refresh();
        new WebDriverWait(Selenide.webdriver().driver().getWebDriver(),Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='title-search-input_fixed']")));

        aptekaMainPage.tabCatalogue.click();





//        googlePage.setSearch();
    }
}