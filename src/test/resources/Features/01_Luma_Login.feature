Feature: To Check Login Functionality
@Login
  @Valid
  Scenario Outline: User Login with Valid Credentials
    Given User is on the Login page
    When User enters valid <Email> and <Pin>
    And Clicks on the Login button
    Then User is logged in successfully

    Examples: 
      | Email                        | Pin        |
      | lososidojit@gotgel.org       | Quali@2023 |
      | gapelus.nujodi@jollyfree.com | Quali@2023 |

  @Invalid
  Scenario Outline: User Login with Invalid Credentials
    Given User is on the Login page
    When User enters invalid <Username> and <Password>
    And Clicks on the Login button
    Then User is not logged in

    Examples: 
      | Username        | Password   |
      | lama@gmail.com  | pass@123   |
      | hello@jollyfree | Quali@2024 |

