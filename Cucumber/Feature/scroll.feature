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
Feature: scroll vertically and horizontally
  I want to scroll vertically and horizontally

  @tag1
  Scenario: Scroll vertically and horizontaly
    Given User navigates to Scrolling Website
    When User try to scroll vertically
    Then Print message as vertically scroll successful
    When User try to scroll horizontally
    Then Print message as horizontal scroll successful