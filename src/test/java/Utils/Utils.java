package Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import runners.RunCucumberTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils  extends RunCucumberTest {

    public static void clicar(WebElement elemento ) {
        elemento.click();
    }

    public static void digitar(WebElement elemento, String texto) {
        elemento.sendKeys(texto);
    }

    public static String pegarTexto(WebElement elemento){
        esperarElementoAparecer(elemento);
        return elemento.getText();
    }

    public static void esperarElementoDesaparecer(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(elemento));

    }

    public static void esperarElementoAparecer(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }

    public static void selecionarComboBox(WebElement elemento, String texto) {
        Select listaSuspensa = new Select(elemento);
        listaSuspensa.selectByVisibleText(texto);
    }

    public static void validarPopup() throws Exception {
        Alert alert = getDriver().switchTo().alert();
        String mensagemDoAlert = alert.getText();
        alert.accept();
    }
}
