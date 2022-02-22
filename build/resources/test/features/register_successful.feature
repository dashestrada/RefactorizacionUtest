@stories
Feature: register successful user  Utest page
  as a user, i want register in the Utest page

  @scenario
  Scenario:Register successful
    Given the Dayana wants to enter the Utest page
    When she performs the registration of your personal data
      | strName | strLastname |    strEmail        | strBirthMonth |  strBirthday |  strBirthYear| strCity | strPostalCode | strCountry | strComputer | strVersionComputer | strLanguaje | strMovilDevices | strModelDevicesModel | strSoMovil | strPassword |
      | Dayana  | Estrada     | dasjhgdkg456j@test.com  |   June        |   21           |   1999       | Monteria | 123456       | Colombia   | Windows     |           10       | Spanish     |  Xiaomi         |  Redmi Note 8 Pro    | Android 9  | Dayana99-123|
    Then she has successfully registered
      | strFinalText  |
      | Complete Setup |
