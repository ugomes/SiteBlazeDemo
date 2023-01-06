package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

    WebDriver driver;
    private By name = By.id("name");
    private By company = By.id("company");
    private By emailAdress = By.id("email");
    private By password = By.id("password");
    private By passwordconfirm = By.id("password-confirm");

    public void preecherNome(String nome) {
        getDriver().findElement(name).sendKeys((nome));
    }

    public void preecherCompany(String companhia) {
        getDriver().findElement(company).sendKeys((companhia));
    }

    public void preecherEmail(String email) {
        getDriver().findElement(emailAdress).sendKeys((email));
    }

    public void preecherPassword(String pass) {
        getDriver().findElement(password).sendKeys((pass));
    }

    public void preecherConfirm(String confirm) {
        getDriver().findElement(passwordconfirm).sendKeys((confirm));
   }

}



