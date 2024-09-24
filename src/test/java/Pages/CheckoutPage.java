package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runners.RunCucumberTest;

import static Utils.Utils.clicar;
import static Utils.Utils.pegarTexto;

public class CheckoutPage extends RunCucumberTest {
   @FindBy(css = "div.six.columns.alpha.description > div > h3 > a")
    private WebElement titlePedido;


    public CheckoutPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String pegarTituloProduto() {
       return pegarTexto(titlePedido);
    }

}
