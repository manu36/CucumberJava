Feature: Prueba de servicio

  @tag1
  Scenario: Validar servicio
    Given Se ejecuta servicio
    Then response de servicio

  @tag2
  Scenario: Validar servicio Pokemon
    Given Se ejecuta servicio pokemon
    Then response de servicio pokemon

  @tag3
  Scenario: Validar servicio Random
    Given Se ejecuta servicio random
    Then response de servicio random