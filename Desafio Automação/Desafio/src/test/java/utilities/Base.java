package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	protected WebDriver driver = new Definitions().iniciarDriver();
	protected WebDriverWait wait = new WebDriverWait(driver,5);
}
