package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class RunnerBase {

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            getDriverEdge(); // Alterado para chamar o método do Edge
        }
        return driver;
    }

    public static WebDriver getDriverEdge() {
        // Configurar opções do Edge
        EdgeOptions options = new EdgeOptions();
        // options.addArguments("–headless"); // Descomentar essa linha caso queira rodar o Edge em modo minimizado

        // Configurar o caminho do driver do Edge se necessário
        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Documents\\UniversidadeQA\\AntonioQA\\msedgedriver.exe");

        driver = new EdgeDriver(options);
        return driver;
    }
}

