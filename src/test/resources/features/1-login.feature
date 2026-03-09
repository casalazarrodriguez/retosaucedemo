@regresion @Login
Feature: TESTCASE-1 - Validar inicio de sesion con credenciales validas

  Background: Validar el inicio de sesion con credenciales validar e invalidas

    Given el usuario navega al sitio web

  @credencialValido @happypath
  Scenario: Validar inicio de sesion con credenciales validas - OK
    When ingresar credenciales validas
    Then la aplicacion muestra el modulo principal de productos

  @credencialInvalido @unhappypath
  Scenario: Validar inicio de sesion con credenciales invalidas - NO OK
    When ingresar credenciales invalidas
    Then la aplicacion muestra un mensaje de error