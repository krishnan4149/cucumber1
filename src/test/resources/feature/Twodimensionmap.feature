Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given User should launch brower
    And user click and customer like
    When user provide vaid details
      | Monthly | Local | International | SMS  | Local Per | International Per | SMS Per |
      |    1074 |  8575 |          1522 |  204 |       851 |               416 |     555 |
      |    1044 |   899 |          6611 |  200 |       881 |               470 |     557 |
      |    1044 |  8995 |         16611 | 7200 | 3 881     |              6470 |     557 |
      |      44 |   899 |               |  200 |      9881 |              0470 |    8557 |
    Then to verife the customer id is displayed
