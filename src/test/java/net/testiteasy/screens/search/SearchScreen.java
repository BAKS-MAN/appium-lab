package net.testiteasy.screens.search;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import java.util.List;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.textCaseSensitive;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchScreen {

  @AndroidFindBy(id = "search_container")
  private SelenideElement SEARCH_SCREEN;

  @AndroidFindBy(id = "search_src_text")
  @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search Wikipedia\"]")
  private SelenideElement SEARCH_WIKIPEDIA_FIELD;

  @AndroidFindBy(id = "search_results_list")
  private SelenideElement SEARCH_RESULT_LIST;

  @FindBy(xpath = "//*[contains(@resource-id,'page_list_item_description')]")
  private List<SelenideElement> SEARCH_RESULT_ITEM_DESCRIPTION;

  public void checkSearchScreenIsDisplayed() {
    SEARCH_SCREEN.shouldBe(Condition.visible);
  }

  public void setValueIntoTheSearchField(String searchInput) {
    SEARCH_WIKIPEDIA_FIELD.sendKeys(searchInput);
  }

  public void checkSearchResultListIsDisplayed() {
    SEARCH_RESULT_LIST.shouldBe(Condition.visible);
  }

  public void checkFirstResultContainsText(String expectedResult) {
    $$(SEARCH_RESULT_ITEM_DESCRIPTION).shouldHave(CollectionCondition.sizeGreaterThan(0));
    SEARCH_RESULT_ITEM_DESCRIPTION.get(0).shouldHave(text(expectedResult));
  }

  public void selectResultContainingText(String expectedResult) {
    $$(SEARCH_RESULT_ITEM_DESCRIPTION).findBy(textCaseSensitive(expectedResult)).click();
  }
}
