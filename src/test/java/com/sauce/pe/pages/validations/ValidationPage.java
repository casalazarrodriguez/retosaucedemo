package com.sauce.pe.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//span[@class='title' and text()='Products']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//h3[@data-test='error']")
    protected WebElementFacade lbl_errorMessage;

    @FindBy(xpath = "//div[@data-test='inventory-item-name' and text()='Sauce Labs Backpack']")
    protected List<WebElementFacade> productsList;

    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    protected WebElementFacade lbl_order;
}
