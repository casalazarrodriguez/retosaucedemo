@regresion @carritoDeCompras
Feature: TESTCASE-2 - Validar carrito de compras

  Background: Realizar 3 validaciones en el carrito de compras

    Given el usuario navega al sitio web
    When ingresar credenciales validas

  @agregarProductos @happypath
  Scenario: Agregar los productos en el carrito - OK
    Then agregar productos al carrito de compras

  @listarProductos @happypath
  Scenario: Listar los productos en el carrito - OK
    And agregar productos al carrito de compras
    And seleccionar icono del carrito
    Then listar los productos agregados en el carrito de compras

  @procesarCompra @happypath
  Scenario: Procesar la compra, se mostrara un mensaje de compra exitosa - OK
    And agregar productos al carrito de compras
    And seleccionar icono del carrito
    When completar todo el registro de la orden
    Then procesar la compra