package com.sauce.pe.steps.validations;

import com.sauce.pe.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion del modulo del productos")
    public Boolean tituloEsVisible() {
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed() {
        return lbl_errorMessage.isDisplayed();
    }

    @Step("validar los productos listados en el carrito")
    public Boolean productsAreDisplayed() {
        for (WebElementFacade product : productsList) {
            if (product.isDisplayed()) {
                return true;
            }
        }
        return false;
    }

    @Step("Validar finalizacion de orden")
    public Boolean orderTextIsDisplayed() {
        return lbl_order.isDisplayed();
    }
}
