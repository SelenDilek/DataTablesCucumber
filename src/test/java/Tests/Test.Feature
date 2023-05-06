
  Feature: User Registiration
    Background:
      Given User navigate to Register Account Page

      @search @smoke @register @regression
      Scenario: Register with mandotory fields
        When User enters below details into the fields
        |firstname|Selen|
        |lastname |Dilek|
        |emailadress|Selen.dilek@gmail.com|
        |telephone|963258741|
        |password|Selen001122|
        And Select privacy Policy field
        And Clicks on the Continue button
        Then Account should get successfully created

        @regression @smoke
      Scenario: Register with all fields
      When User enters enters firstname "Selen"
      And Enters lastname "Dilek"
      And Enters enailadsress "dilek01@gmail.com"
      And Enters telephone "01235454"
      And Enters password "0002558544"
      And Select privacy Policy field
      And Clicks on the Continue button
      Then Account should get successfully created


