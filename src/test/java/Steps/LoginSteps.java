package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import runners.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {
    LoginPage loginPage = new LoginPage();

    @Given("realize login no site sauce demo")
    public void realizeLoginNoSiteSauceDemo() {
        getDriver().get("https://sauce-demo.myshopify.com/account/login");
        loginPage.digitarEmail();
        loginPage.digitarSenha();
        loginPage.clicarBtnLogin();

    }

}
