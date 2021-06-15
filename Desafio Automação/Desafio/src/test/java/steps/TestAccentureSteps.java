package steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class TestAccentureSteps {

	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 2);
	}
	@Dado("que estou no site da accenture")
	public void que_estou_no_site_da_accenture() {
		driver.get("https://www.accenture.com/br-pt");
	}

	@Quando("abro as configuracoes de cookies")
	public void abro_as_configura_es_de_cookies() throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-pc-btn-handler")));
			driver.findElement(By.id("onetrust-pc-btn-handler")).click();
		}catch(Exception e) {
			throw new Exception("nao passou");

		}
	}


	@Quando("clico em Confirmar minhas escolhas")
	public void clico_em_confirmar_minhas_escolhas() {
		driver.findElement(By.className("save-preference-btn-handler onetrust-close-btn-handler")).click();
	}

	@Quando("clico em configuracoes de cookie")
	public void clico_em_configura_es_de_cookie() {
		driver.findElement(By.id("optanon-minimize-button")).click();
	}

	@Entao("devo ver o item de {string}")
	public void devo_ver_o_item_de(String string) {

	}

	@Entao("devo ver {string}")
	public void devo_ver(String string) {

	}


	/*	@After
	public void after () {
		 driver.quit();


}*/
}
