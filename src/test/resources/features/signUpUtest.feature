# Autor: Marcos Bethancourtt
@stories
Feature: Sing-Up uTest
  As a user, I want to register in the uTest community
  @scenario1
  Scenario: Successful registration
    Given than brandom wants to join the uTest community
    When he fill out the registration form on the uTest web page.
      |firstName|lastName|email|birthMonth|birthDay|year|language|city|zip|password|
      |Brandom|Zapata|brandom1@email.com|October|6|1992|Spanish|Medellin|050004|Choucair2021*|
    Then he should see the confirmation page
      |message|
      |Welcome to the world's largest community of freelance software testers!|
