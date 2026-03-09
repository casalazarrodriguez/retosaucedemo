package com.sauce.pe.pages.Shopping;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ShoppingCartPage extends PageObject {

    @FindBy(xpath = "//button[@id='checkout']")
    protected WebElementFacade checkOutButton;

    @FindBy(id = "first-name")
    protected WebElementFacade txt_firstname;

    @FindBy(id = "last-name")
    protected WebElementFacade txt_lastname;

    @FindBy(id = "postal-code")
    protected WebElementFacade txt_postal;

    @FindBy(id = "continue")
    protected WebElementFacade continueButton;

    @FindBy(id = "finish")
    protected WebElementFacade finishButton;
}
