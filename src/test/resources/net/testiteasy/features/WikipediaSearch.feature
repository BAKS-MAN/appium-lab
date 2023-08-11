@smoke
Feature: Wikipedia search screen

  As a regular user of the Wikipedia application, I want to be able to see the Welcome screen.

  @smoke
  @regression
  Scenario: Open application on the welcome screen
    Given user open application
    And welcome screen ready
    When user tap on the search field
    Then check search screen is displayed
    When user type in search line 'Appium'
    Then check search result list is displayed
    And check first result contains text 'Automation for Apps'
    When user selects result containing text 'Automation for Apps'