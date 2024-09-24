package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runners.RunCucumberTest;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;

public class HomePage extends RunCucumberTest {
   @FindBy(css = "#logo > a")
    private WebElement btnSimple;

    @FindBy(id = "product-2")
    private WebElement jacket2;

    @FindBy(css = "#minicart > a.checkout")
    private WebElement btnCheckout;



    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void setBtnSimple() {
        clicar(btnSimple);
    }

    public void clicarjacket2() {
        clicar(jacket2);
    }

    public void clicarBtnCheckout() {
        clicar(btnCheckout);
        clicar(btnCheckout);
    }
}
