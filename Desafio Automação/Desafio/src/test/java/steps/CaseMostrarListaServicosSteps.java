package steps;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import utilities.Base;
import utilities.Definitions;


public class CaseMostrarListaServicosSteps extends Base{
	
	
	@Quando("clico no menu serviços")
	public void clico_no_menu_serviços() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]/span")).click();
	}

	@Quando("clico no item do menu cloud")
	public void clico_no_item_do_menu_cloud() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cloud")));
	    driver.findElement(By.linkText("Cloud")).click();
	}

	@Então("devo encontrar o título {string}")
	public void devo_encontrar_o_título(String titulo) {
		String tituloObtido = driver.findElement(By.xpath("//h1[text()=\\\"Serviços de Cloud\\\"]")).getText(); 
	    Assert.assertEquals(titulo, tituloObtido);
	}

	
}
