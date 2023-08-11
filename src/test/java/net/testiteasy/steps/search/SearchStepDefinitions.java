package net.testiteasy.steps.search;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.testiteasy.screens.search.SearchScreen;
import net.testiteasy.screens.search.SearchScreenObjectFactory;

public class SearchStepDefinitions {

    private final SearchScreen searchScreen = SearchScreenObjectFactory.get();

    @When("user type in search line {string}")
    public void userTypeInSearchLine(String searchInput) {
        searchScreen.setValueIntoTheSearchField(searchInput);
    }

    @Then("check search screen is displayed")
    public void checkSearchScreenIsDisplayed(){
        searchScreen.checkSearchScreenIsDisplayed();
    }

    @Then("check search result list is displayed")
    public void checkSearchResultListIsDisplayed(){
        searchScreen.checkSearchResultListIsDisplayed();
    }

    @Then("check first result contains text {string}")
    public void checkFirstResultContainsText(String expectedText) {
        searchScreen.checkFirstResultContainsText(expectedText);
    }

    @When("user selects result containing text {string}")
    public void selectResultContainingText(String expectedText) {
        searchScreen.selectResultContainingText(expectedText);
    }
}
