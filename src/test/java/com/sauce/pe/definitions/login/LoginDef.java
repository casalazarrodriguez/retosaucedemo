package com.sauce.pe.definitions.login;

import com.sauce.pe.steps.login.LoginStep;
import com.sauce.pe.steps.validations.ValidationStep;
import com.sauce.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://www.saucedemo.com/");
    }

    @When("ingresar credenciales validas")
    public void userLoginWithValidCredentials() {
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();
    }

    @Then("la aplicacion muestra el modulo principal de productos")
    public void systemShowProductsModule() {
        Assertions.assertTrue(validate.tituloEsVisible());
    }

    @When("ingresar credenciales invalidas")
    public void userLoginWithInvalidCredentials() {
        login.typeUsername("standard_user");
        login.typePassword("78946524");
        login.clickLogin();
    }

    @Then("la aplicacion muestra un mensaje de error")
    public void systemShowErrorMessage() {
        Assertions.assertTrue(validate.errorMessageIsDisplayed());
    }


}
