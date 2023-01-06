package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CadastroPage;
import pages.ClickPage;
import runner.RunCucumberTest;

import java.util.concurrent.TimeUnit;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();
    @Quando("^preencho o formulario$")
    public void preencho_o_formulario()  {
        cadastroPage.preecherNome("Moacir");
        cadastroPage.preecherCompany("Moacir S/A");
        cadastroPage.preecherEmail("lider@lider.com.br");
        cadastroPage.preecherPassword("123456");
        cadastroPage.preecherConfirm("123456");


    }
        ClickPage clickPage = new ClickPage();
    @Quando("^clico em registrar$")
    public void clico_em_registrar()  {
        clickPage.clicarNoBotaoRegister();

    }

    @Entao("^aparece a frase Page Expired$")
    public void aparece_a_frase_Page_Expired ()  {
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String resultado_atual = getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]")).getText();
        Assert.assertEquals("Page Expired",resultado_atual);
   }

}
