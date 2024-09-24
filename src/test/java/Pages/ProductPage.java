package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runners.RunCucumberTest;

import static Utils.Utils.clicar;
import static Utils.Utils.selecionarComboBox;

public class ProductPage extends RunCucumberTest {
   @FindBy(id = "product-select-option-0")
    private WebElement comboBoxTamanho;

    @FindBy(id = "product-select-option-1")
    private WebElement comboBoxColor;

    @FindBy(id = "add")
    private WebElement btnCarrinho;

    public ProductPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void setComboBoxTamanho(String texto) {
        selecionarComboBox(comboBoxTamanho,texto );
    }

    public void setComboBoxColor(String texto) {
        selecionarComboBox(comboBoxColor,texto);
    }
    public void clicarBotaoCarrinho(){
        clicar(btnCarrinho);
    }

}
