package pages;

import java.time.Duration;
import aquality.selenium.elements.interfaces.IButton;
import org.openqa.selenium.By;
import aquality.selenium.browser.AqualityServices;

public class Dashboard {

	public IButton getPluginsButton(){
		return AqualityServices.getElementFactory().getButton(By.xpath("//div[contains (text(), 'Plugins')]"), "Plugins Button");
	}
	
	public void searchForWPDarkModePlugin() {
		getPluginsButton().clickAndWait();
		AqualityServices.getElementFactory().getTextBox(By.id("plugin-search-input"), "Plugin Search").sendKeys("WP Dark Mode");
		AqualityServices.getBrowser().setImplicitWaitTimeout(Duration.ofSeconds(5));
	}

	public IButton getWPDarkModeButton(){
		return AqualityServices.getElementFactory().getButton(By.xpath("//div[contains (text(), 'WP Dark Mode')]"), "WP Dark Mode Button");
	}
	public boolean isWPDarkModeInstalled(){
		searchForWPDarkModePlugin();
		return AqualityServices.getElementFactory().getButton(By.id("activate-wp-dark-mode"), "Activate WP Dark Mode").state().isDisplayed();
	}
	
	public void installAndActivateDarkMode () {
		AqualityServices.getElementFactory().getButton(By.xpath("//a[@class='page-title-action' and contains (text(), 'Add New')]"),
					"Add New").clickAndWait();
		AqualityServices.getElementFactory().getTextBox(By.id("search-plugins"), "New Plugin Search").sendKeys("WP Dark Mode");
		AqualityServices.getBrowser().setImplicitWaitTimeout(Duration.ofSeconds(10));
		AqualityServices.getElementFactory().getButton(By.xpath("//a[@data-slug='wp-dark-mode']"), "Add wp dark mode plugin").clickAndWait();
		AqualityServices.getBrowser().setImplicitWaitTimeout(Duration.ofSeconds(50));
	}

	
	public void activateDarkMode() {
		searchForWPDarkModePlugin();
		AqualityServices.getElementFactory().getButton(By.id("activate-wp-dark-mode"), "Activate WP Dark Mode").clickAndWait();
	}
	
	public void navigateToWPDarkMode() {
		getPluginsButton().clickAndWait();
		getWPDarkModeButton().clickAndWait();
	}
	
	public boolean isDarkModeWorking() {
		return AqualityServices.getElementFactory().getLabel(By.xpath("//h2[contains (text(), 'WP Dark Mode Usage')]"), 
				"Dark Mode Element").state().isDisplayed();
	}
}