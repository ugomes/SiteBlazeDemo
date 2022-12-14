package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;
    private By name = By.id("name");
    private By company = By.id("company");
    private By emailAdress = By.id("email");
    private By password = By.id("password");
    private By passwordconfirm = By.id("password-confirm");


    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preecherNome(String nome) {
        driver.findElement(name).sendKeys((nome));
    }

    public void preecherCompany(String companhia) {
        driver.findElement(company).sendKeys((companhia));
    }

    public void preecherEmail(String email) {
        driver.findElement(emailAdress).sendKeys((email));
    }

    public void preecherPassword(String pass) {
        driver.findElement(password).sendKeys((pass));
    }

    public void preecherConfirm(String confirm) {
        driver.findElement(passwordconfirm).sendKeys((confirm));
   }

}



