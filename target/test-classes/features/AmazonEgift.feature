#Author: Niresh Perera
#Feature: Select e gift card from Amazon.

@tag
Feature: Select e gift card from Amazon

  @tag1
  Scenario: 1 Search Amazon on Google and change the country 
    Given User enter "Amazon" on Google search
    When User click on search button
    And User select the "Amazon.com" link in the search results and click
    And User click on the Deliver To button
    And User select "Switzerland" as a country
    And User click done button
    Then User verify Deliver to updated with "Switzerland" country name
    
  Scenario: 2 Search egift card on Amazon and select different amount  
    Given User enter "e gift card" on Amazon search
    When User click search button
    And User click on "eGift Cards" button
    And User select a gift card
    Then User verify the preview image should be updated with the selected design "Birthday Candles"
    When User select a different amount like "$75"
    Then User verify preview image value should be updated with the new amount "$75.00"
    