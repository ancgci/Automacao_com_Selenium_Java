package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import runners.RunCucumberTest;

public class HomeSteps extends RunCucumberTest {
    HomePage homePage = new HomePage();

    @And("estou na tela inicial")
    public void estouNaTelaInicial() {
        homePage.setBtnSimple();
    }

    @When("seleciono a blua noir jacket")
    public void selecionoABluaNoirJacket() {
        homePage.clicarjacket2();
    }

    @And("clico no botão adiconar ao do menu checkout")
    public void clicoNoBotaoAdiconarAoDoMenuCheckout() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().navigate().to("https://sauce-demo.myshopify.com/cart");
    }
}
