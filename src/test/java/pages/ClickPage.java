package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickPage {

    WebDriver driver;

    public ClickPage(WebDriver driver) {
        this.driver = driver;
    }
     public void clicarNoBotaoRegister(){
        driver.findElement(By.cssSelector("div.container div.row div.col-md-8.col-md-offset-2 div.panel.panel-default div.panel-body form.form-horizontal " +
                "div.form-group:nth-child(7) div.col-md-6.col-md-offset-4 > button.btn.btn-primary")).click();
     }

}
