#Author: priyalakshmi

Feature: priya page
@priyalax
  
  Scenario Outline: different login
    Given launch browser as "<BROWSER>"
    And get url as "<URL>"
    When enter username as  "<USERNAME>"
    And enter password as "<PASSWORD>"
    And click button
    Then check
    

    Examples: 
      | BROWSER   | URL                                            | USERNAME       | PASSWORD   |
      | chrome    | https://djangovinoth.pythonanywhere.com/login/ | priyalakshmi   | priya12345 |
      | chrome1   | https://djangovinoth.pythonanywhere.com/login/ | priyamanoharan | Kavin@123  |
