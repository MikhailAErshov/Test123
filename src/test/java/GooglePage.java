import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class GooglePage {
    public SelenideElement search = $x("//textarea[@name='q']");

    public void setSearch(){
        search.should(Condition.visible, Duration.ofSeconds(9));
        search.click();
        search.sendKeys("book");
        search.pressEnter();
    }
}
