Feature: Entering details into the submission form

  Scenario Outline: As a user I want to enter a contact name
    Given I am navigated to the form
    When I provide a contact name <name>
    Then I should not see the word invalid in the contact name field

    Examples:
      | name                                |
      | Nóirín D'Angelo                     |
      | Amy Katherine Sophia Murphy-Higgins |

  Scenario Outline: As a user I want to enter Address Line 1 information
    Given I am navigated to the form
    When I provide address line one <address>
 #   And I clear the address line one field
    Then I should not see the word invalid in the address line one field

    Examples:
    | address          |
    | 25 Kéadúe        |
    | Flat 1.A l'Havre |





