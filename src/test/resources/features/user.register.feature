#Autor: Hector
  @stories
  Feature: User register in UTest page
    As a user of the uTest page, I want to register on the platform
    @scenario1
    Scenario: User successful register
      Given tatiana wants to sign up on the platform
      When she send the required information
      | firstName | lastName   | emailAddress      | moth       | day | year | city     | zip    | country | mobile | model         | operatingSystem | password     |
      | Tatiana   | Villa      | Tatia29@gmail.com | October    | 5   | 1999 | Colombia | 111131 | Bogotá  | Xiaomi | Redmi 9 Power | Android 11      | 199816Tpedro |
      Then tatiana will be registered into the system
      | answerFinal     |
      | Complete Setup  |