package com.sauce.pe.steps.products;

import com.sauce.pe.pages.products.SelectProductPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class SelectProductStep extends SelectProductPage {

    @Step("Agregar productos al carrito de compras")
    public void addProducts(int quantity) {
        for (int i = 0; i < quantity; i++) {
            Actions act = new Actions(getDriver());
            act.click(products.get(i)).perform();
        }
    }

    @Step("seleccionar icono del carrito")
    public void selectShoppingCartIcon() {
        // Usamos Javascript para asegurar el clic, evitando que el globo rojo bloquee la acción
        evaluateJavascript("arguments[0].click();", shoppingCartIcon);
    }
}
