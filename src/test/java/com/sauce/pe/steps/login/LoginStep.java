package com.sauce.pe.steps.login;

import com.sauce.pe.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep extends LoginPage {


    @Step("Ingresar Usuario")
    public void typeUsername(String username) {
        txt_username.sendKeys(username);
    }

    @Step("Ingresar Contraseña")
    public void typePassword(String password) {
        txt_password.sendKeys(password);
    }

    @Step("Click en el boton Login")
    public void clickLogin() {
        btn_login.click();
    }


}
