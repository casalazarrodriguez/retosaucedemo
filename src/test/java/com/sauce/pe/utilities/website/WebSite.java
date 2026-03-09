package com.sauce.pe.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class WebSite {

    @Steps(shared = true)
    PageObject sauce;

    @Step("Navegar al sitio web")
    public void navigateTo(String url) {
        sauce.setDefaultBaseUrl(url);
        sauce.open();
    }

}
