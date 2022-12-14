package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
        public void acessarTelaLogin(){
            driver.get("https://blazedemo.com/register");
            esperarElementoEstarPresente(By.id("password-confirm"),10);

        }



}