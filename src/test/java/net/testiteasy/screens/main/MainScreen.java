package net.testiteasy.screens.main;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.testiteasy.utils.variables.OSType;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static net.testiteasy.utils.parameters.TestDataParams.testConfig;

@SuppressWarnings("unused")
public class MainScreen {

    @AndroidFindBy(id = "fragment_onboarding_skip_button")
    @iOSXCUITFindBy(id = "Skip")
    private SelenideElement SKIP_BUTTON;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Explore\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Explore\"]")
    private SelenideElement EXPLORE_ICON;

    @AndroidFindBy(id = "search_container")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search Wikipedia\"]")
    private SelenideElement SEARCH_WIKIPEDIA_FIELD;

    public void waitForMainContainerToAppear() {
        if ($(SKIP_BUTTON).is(Condition.visible)) {
            $(SKIP_BUTTON).click();
        }
    }

    public void checkExploreIcon() {
        EXPLORE_ICON.shouldBe(Condition.visible);
    }

    public void checkSearchFieldIsVisible() {
        SEARCH_WIKIPEDIA_FIELD.shouldBe(Condition.visible);
    }

    public void clickOnSearchField() {
        SEARCH_WIKIPEDIA_FIELD.shouldBe(Condition.visible).click();
    }

}
