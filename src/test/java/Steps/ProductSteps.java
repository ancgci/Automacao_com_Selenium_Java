package Steps;

import Pages.HomePage;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import runners.RunCucumberTest;

public class ProductSteps extends RunCucumberTest {
    ProductPage productPage = new ProductPage();

    @And("escolho o tamanho {string}")
    public void escolhoOTamanho(String texto) {
        productPage.setComboBoxTamanho(texto);
    }

    @And("escolho a cor {string}")
    public void escolhoACor(String texto) {
        productPage.setComboBoxColor(texto);
    }


    @And("clico no botão adiconar ao carrinho")
    public void clicoNoBotaoAdiconarAoCarrinho() throws InterruptedException {
        productPage.clicarBotaoCarrinho();

    }
}
