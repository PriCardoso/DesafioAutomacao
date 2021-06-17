package steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import utilities.Base;

public class CaseAcessarItensMenu extends Base{
	@Dado("que eu estou no {string}")
	public void que_eu_estou_no(String string) {
		driver.get("https://www.accenture.com/br-pt");
	   
	}
	
	@Quando("clico no menu {string}")
	public void clico_no_i_menu(String menu) {
		if(menu.equals("sobre a accenture")) {
			   driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/nav/div/div[1]/div[3]/div[1]/div[5]/div[1]/span")).click(); 

		}
		if(menu.equals("servicos")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='navigation-menu']/div[2]/div/span"))).click();

		}
		if(menu.equals("menu carreiras")) {
		    driver.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[4]/div[1]/span")).click();
		}
	}

	@Quando("clico no item do menu {string}")
	public void clico_no_item_do_menu(String itemMenu) {
		if(itemMenu.equals("sobre a accenture")) {
			driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/nav/div/div[1]/div[3]/div[1]/div[5]/div[2]/div/div/ul/li[1]/ul/li[1]/a")).click(); 
		}
		if(itemMenu.equals("cloud")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cloud")));
		    driver.findElement(By.linkText("Cloud")).click();
		}
		if(itemMenu.equals("Vagas em tecnologia")) {
		    driver.findElement(By.linkText("Vagas em tecnologia")).click();
		}
	}
	
	@Então("devo ver o destaque em {string}")
	public void devo_ver_o_destaque_em(String destaque) {
		if(destaque.equals("Nosso propósito")) {
			 driver.findElement(By.className("sectionTitle")); 
			  String frase = driver.findElement(By.className("sectionTitle")).getText();
			  System.out.println(frase);
			  System.out.println("Nosso propósito:");
			  assertEquals(destaque, frase);
		}
		if(destaque.equalsIgnoreCase("Carreiras em tecnologia")) {
			String frase = driver.findElement(By.xpath("//*[@id=\"aoi-hero\"]/div/div/div[1]/div/article/div/h1")).getText();
			assertEquals(frase, "Carreiras em tecnologia");		  
		}
		 		  
	}
	/*@Dado("clico no menu carreiras")
	public void clico_no_menu_carreiras() {
	}*/
	/*@Dado("clico no item do menu vagas em tecnologia")
	public void clico_no_item_do_menu_vagas_em_tecnologia() {
	}*/

	/*@Então("devo ver o destaque em {string}")
	public void devo_ver_o_destaque_em(String string) {
		
	}*/
	
	

	
}