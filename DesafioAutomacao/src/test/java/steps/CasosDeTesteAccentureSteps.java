package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;


public class CasosDeTesteAccentureSteps {
	
	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Pri\\Google Drive (priscillaabcardoso@gmail.com)\\QA Gama Academy\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		wait	=	new	WebDriverWait(driver,	15);

	}
	
	@Dado("que eu estou no site da accenture")
	public void que_eu_estou_no_site_da_accenture() {
	driver.get("https://www.accenture.com/br-pt");	   
	}

	@Dado("aceito os termos LGPD")
	public void aceito_os_termos_lgpd() {
		driver.findElement(By.id("onetrust-pc-btn-handler")).click();
		driver.findElement(By.id("close-pc-btn-handler")).click();
	}

	@Então("deve fechar a caixa de informação")
	public void deve_fechar_a_caixa_de_informação() {
		String resultadoEsperado = "Accenture | Brasil| Que venha a mudança";
        Assert.assertEquals(resultadoEsperado, driver.getTitle());
	}
	
	@Dado("clico em configurações de cookie")
	public void clico_em_configurações_de_cookie() {
		driver.findElement(By.linkText("Configuração dos cookies")).click();	   
	}

	@Então("devo ver o item de {string}")
	public void devo_ver_o_item_de(String string) {
	   
	}

	@Então("devo ver {string}")
	public void devo_ver(String string) {
	    
	}
	@After
	public void dps() {
		driver.manage().deleteAllCookies();

		driver.quit();
	}

}













