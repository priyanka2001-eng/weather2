#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: To verify all important information is present on the page

Background:
    Given I open Chrome
    And I go to ApplicationURL
 @Firstage
 Scenario: Verification of fields on the page
      Then The field with locatorName should be present
      Then Total number of links present 
  
  
  @Negative
  Scenario: On entering invalid data website suggests city is Not found   
  And User enters the invalid name of city as xyz
  And User clicks on the button
  Then The output should be Not found
  
  @Positive
  Scenario: On entering valid data website successfully returns weather details for the city.
  And User enters the valid name of city as Mumbai
  And User clicks on the button
  Then The correct result should be displayed