package Steps;

import Pages.CheckoutPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import runners.RunCucumberTest;

public class CheckoutSteps extends RunCucumberTest {

    private static final String TTILE_PEDIDO = "Noir jacket - L / Red";
    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("verifico se o titulo do pedido está correto")
    public void verificoSeOTituloDoPedidoEstaCorreto() {
        Assert.assertArrayEquals(checkoutPage.pegarTituloProduto().getBytes(), TTILE_PEDIDO.getBytes());

    }
}
