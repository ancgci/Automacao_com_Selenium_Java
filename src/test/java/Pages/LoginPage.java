package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runners.RunCucumberTest;

import static Utils.Utils.clicar;
import static Utils.Utils.digitar;

public class LoginPage extends RunCucumberTest {
   @FindBy(id = "customer_email")
    private WebElement txtEmail;

   @FindBy(id = "customer_password")
    private WebElement txtSenha;

   @FindBy(css = "#customer_login > div.action_bottom > input")
    private WebElement btnLogin;

   public LoginPage() {
       PageFactory.initElements(getDriver(), this);
   }
   public void digitarEmail() {
       digitar(txtEmail, "sr.antoniocarlos@gmail.com");
   }

   public void digitarSenha() {
       digitar(txtSenha, "Ant@123456");
   }

   public void clicarBtnLogin() {
       clicar(btnLogin);
   }
}
