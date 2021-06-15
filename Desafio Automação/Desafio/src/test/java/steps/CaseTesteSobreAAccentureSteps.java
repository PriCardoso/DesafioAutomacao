package steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CaseTesteSobreAAccentureSteps {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver(); 	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
		
	
	@Dado("que eu estou no {string} da accenture")
	public void que_eu_estou_no_da_accenture(String string) {
		driver.get("https://www.accenture.com/br-pt");
	   
	}

	@Quando("clico no {string} sobre a accenture")
	public void clico_no_sobre_a_accenture(String menu) {
	   driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/nav/div/div[1]/div[3]/div[1]/div[5]/div[1]/span")).click(); 
	   	   
	}

	
	@Quando("clico no item do menu {string} a accenture")
	public void clico_no_item_do_menu_a_accenture(String sobre) {
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/nav/div/div[1]/div[3]/div[1]/div[5]/div[2]/div/div/ul/li[1]/ul/li[1]/a")).click(); 
	}
	

	@Então("devo ver o {string} em {string}")
	public void devo_ver_o_em(String string, String string2) {
		  driver.findElement(By.className("sectionTitle")); 
		  String frase = driver.findElement(By.className("sectionTitle")).getText();
		  System.out.println(frase);
		  System.out.println("Nosso propósito:");
		  assertEquals(frase, "Nosso propósito:");		  
	}
	
	@After
	public void dps() { 
		driver.quit(); 
	}
	

}
