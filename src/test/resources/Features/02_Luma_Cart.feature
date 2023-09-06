Feature: Feature to check the functionality of adding items to the cart 
@Cart
 Scenario Outline: Check the functionality of adding items to the cart
    Given User is successfully logged in using valid <Username> and <Password>   
    And Hover the mouse cursor over the Mens section and select the section
    Then Add items to cart 
    
    
      Examples: 
      | Username                     | Password   |
      | lososidojit@gotgel.org       | Quali@2023 |
    
    