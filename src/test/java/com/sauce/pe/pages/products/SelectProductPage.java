package com.sauce.pe.pages.products;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class SelectProductPage extends PageObject {

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory ']")
    protected List<WebElementFacade> products;

    @FindBy(xpath = "//a[@data-test='shopping-cart-link']")
    protected WebElementFacade shoppingCartIcon;

}
