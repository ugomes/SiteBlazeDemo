package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {

    public void acessarTelaLogin(){
            getDriver().manage().window().maximize();
            getDriver().get("https://blazedemo.com/register");
            Utils.esperarElementoEstarPresente(By.id("password-confirm"),10);

        }



}