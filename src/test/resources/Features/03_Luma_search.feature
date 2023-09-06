Feature: To Verify Product Search Functionality
@Search
  Scenario Outline: Product Search without Signin
    Given The user is on the Home page
    When The user enters the <Keyword> on the SearchField and searched
    Then Search results are displayed

    Examples: 
      | Keyword |
      | Shirt   |
      | Pant    |
      | Watch   |
      |     123 |
