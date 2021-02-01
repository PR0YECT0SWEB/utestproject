#Autor: DERLEVIN BEDOYA HERNANDEZ
  @stories
  Feature: Test to the utest page
    As a user,
    I want to automate
    For complete the form in order
  @scenario1
  Scenario Outline: Complete the form in order to create a new user
    Given than derlevin wants to enter the utest page to automate
    When he fills out the form
    | strName   | strLastName   | strMail   | strPassword   |
    | <strName> | <strLastName> | <strMail> | <strPassword> |
    Then he finds the name
    | strValidation   |
    | <strValidation> |

    Examples:
      | strName   | strLastName   | strMail           | strPassword     | strValidation  |
      | DERLEVIN  | BEDOYA        | DERLE@HOTMAIL.COM | H4yW-f/#xtj4JRE | Complete Setup |
