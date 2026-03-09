package com.sauce.pe.definitions.shopping;

import com.sauce.pe.steps.products.SelectProductStep;
import com.sauce.pe.steps.shopping.ShoppingCartStep;
import com.sauce.pe.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;

public class ShoppingDef {

    @Steps(shared = true)
    SelectProductStep selectProduct;

    @Steps(shared = true)
    ValidationStep validate;

    @Steps(shared = true)
    ShoppingCartStep shoppingCart;

    @Then("agregar productos al carrito de compras")
    public void userAddProducts() {
        selectProduct.addProducts(2);
    }

    @And("seleccionar icono del carrito")
    public void userClickShoppingCartIcon() {
        selectProduct.selectShoppingCartIcon();
    }

    @Then("listar los productos agregados en el carrito de compras")
    public void systemListProducts() {
        Assertions.assertTrue(validate.productsAreDisplayed());
    }

    @When("completar todo el registro de la orden")
    public void userCompleteOrder() {
        shoppingCart.clickCheckOutButton();
        shoppingCart.typeFirstName("Carlos");
        shoppingCart.typeLastName("Salazar");
        shoppingCart.typePostal("12345");
        shoppingCart.clickContinueButton();
        shoppingCart.clickFinish();
    }
    
    @Then("procesar la compra") 
    public void systemProcessShoppingCart() {
        Assertions.assertTrue(validate.orderTextIsDisplayed());
    }
}
