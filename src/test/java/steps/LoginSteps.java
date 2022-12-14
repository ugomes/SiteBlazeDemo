package steps;

import cucumber.api.java.pt.Dado;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

   LoginPage loginPage = new LoginPage(driver);

    @Dado("^que estou na pagina de login$")
    public void que_estou_na_pagina_de_login()  {
        loginPage.acessarTelaLogin();

    }

}
