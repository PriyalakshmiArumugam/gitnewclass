#Author: lakshmipria97@gmail.com
@RegressionTest
Feature: login to Djanglo page
Background:
Given Lanch the Browser
  
  Scenario Outline: valid username to check
    Given Lanch the maximize
    When Lanch the Url as "<Url>"
    And put the valid username as "<Username>"
    And put the valid password as "<Password>"
    Then click the login button
    
    Examples: 
      | Url                                            | Username       | Password   |
      | https://djangovinoth.pythonanywhere.com/login/ | priyalakshmi   | priya12345 |
      | https://djangovinoth.pythonanywhere.com/login/ | priyamanoharan | Kavin@123  |
      
