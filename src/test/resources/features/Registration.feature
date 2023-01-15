Feature: Event Flow Tests

  @RegressionTest @Shiva
  Scenario: Registration TC-01: Verify Sign in user flow Registration
    Given Login as a Default User
    When Select Registrating as Self
    And Search for an Event Email Validation Testing
    And Click on Register button
  #	And Enter all the Attendee Info
  #	And Click on continue Payment button
  #	When Enter and submit CC Details on Events Platform
  #	Then Verify sucessfully registered message
  
  @RegressionTest @EventsTest11
  Scenario: Registration TC-02: Verify Guest user flow Registration
    Given Search for an Event Email Validation Testing
    When Click on Register button
    And Click on the continue as a guest
    And Select Attendance Type as Inperson
    And Select Registering for Individual
    #	Then Click on the Add Attendees button
    And Enter Email address
    And Enter First Name
    And Enter LastName
    And Enter Phone number
    And Click on Continue to Payment button
    And Click on the payment billing button
    And Enter credit card details number 
    And Enter cvv detail
    And Enter Expiration Date
    And Enter Billing address Details
    And Click on Submit and Register button
  #  And Verify registered successfully message displayed or not

  #	Then Verify sucessfully registered message
  Scenario Outline: Registration TC-03: Verify Sign in user flow Registration
    Given Login as a Default User
    When Select Registrating as <RegistratingType>
  #  And Search for an eventname <EventName>
