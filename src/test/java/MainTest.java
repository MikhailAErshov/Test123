import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainTest extends WebTest {
    @Test
    public void testLogin() {
        open("https://www.google.ru");
        $x("//textarea[@name='q']").should(Condition.visible, Duration.ofSeconds(10));
        $x("//textarea[@name='q']").click();
        $x("//textarea[@name='q']").sendKeys("book");
        $x("//textarea[@name='q']").pressEnter();
    }
}