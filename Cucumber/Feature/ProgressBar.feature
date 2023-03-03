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
Feature: Stop Progress bar when 50 % is reached
  I want to click on stop button when progress bar reached 50%

  @tag1
  Scenario: Click on Start button of progress bar
    Given Navigate to Progress Bar screen
    And Start and Stop button is getting displayed
    When I click on start button
    Then progress bar reached 50% click on stop button