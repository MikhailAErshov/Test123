import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AptekaMainPage {
    public SelenideElement confirmRegion = $x("//div[@class='confirm_region']");
    public SelenideElement tabCatalogue = $x("//*[@id='app']/div[1]/header/div/div/div[1]/div/button");
    public SelenideElement tabCataloguePoint = $x("//span[contains(text(),'Гели для душа')]");
    public SelenideElement searchField = $x("//*[@id='title-search-input_fixed']");
}
