#Author: mohammedirfan.shaik878@gmail.com


Feature: Validating the STC TV subscription Packages

Background: 
	Given Navigate to STC TV Website
  

  Scenario: Verify the Subscription packages for Saudi Arabia
   	And Validate Premium Type, Price and Currency
    And Validate Classic Type, Price and Currency
    And Validate Lite Type, Price and Currency
    
    
    Scenario: Verify the Subscription packages for Kuwait
    Then Change Country to Kuwait
    And Validate Premium Type, Price and Currency
    And Validate Classic Type, Price and Currency
    And Validate Lite Type, Price and Currency
    
    
    Scenario: Verify the Subscription packages for Bahrain
    Then Change Country to Bahrain
    And Validate Premium Type, Price and Currency
    And Validate Classic Type, Price and Currency
    And Validate Lite Type, Price and Currency
    
    
