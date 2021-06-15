package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

public class CaseAceitarCookiesSteps {
	
	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		
		wait	=	new	WebDriverWait(driver,30);

	}
	
	@Dado("que estou no site da accenture")
	public void que_estou_no_site_da_accenture() {
		driver.get("https://www.accenture.com/br-pt");	    
	}

	@Dado("abro as configurações de cookies")
	public void abro_as_configurações_de_cookies() {
		driver.findElement(By.id("onetrust-pc-btn-handler")).click();
	}

	@Dado("clico em Confirmar minhas escolhas")
	public void clico_em_confirmar_minhas_escolhas() {
	    driver.findElement(By.xpath("//*[@id=\"onetrust-pc-sdk\"]/div[3]/div[1]/button[1]")).click();
	}

	@Então("deve fechar o modal")
	public void deve_fechar_o_modal() {
		assertEquals("Accenture | Brasil| Que venha a mudança", driver.getTitle());
		System.out.println(driver.getTitle());
	}
	@After
	public void dps() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}

}
