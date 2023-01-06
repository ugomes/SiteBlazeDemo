package steps;

import cucumber.api.java.pt.Dado;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

   LoginPage loginPage = new LoginPage();

    @Dado("^que estou na pagina de login$")
    public void que_estou_na_pagina_de_login()  {
        getDriver(Browser.CHROME);
        loginPage.acessarTelaLogin();

    }

}
