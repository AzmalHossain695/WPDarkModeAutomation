package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GeneralSettings {
	
	public void enableAdminPanelDarkMode() {
		AqualityServices.getElementFactory().getButton(By.xpath("//a[contains(text(), 'Admin Panel Dark Mode')]"),
				"Admin panel Dark Mode").click();
		AqualityServices.getElementFactory().getButton(By.xpath("//div[@class='relative w-10 h-full rounded-full transition duration-100 bg-slate-200']"),
				"Enable Admin panel Dark Mode").click();
	}
	
	public void navigateToDashboard() {
		AqualityServices.getElementFactory().getButton(By.xpath("//div[contains (text(), 'Dashboard')]"),
				"Dashboard").clickAndWait();
	}
	
	public void gotoSwitchSettings() {
		AqualityServices.getElementFactory().getButton(By.xpath("//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[1]/div[2]/div[2]/div/div/div/h4"), "Customization Button").clickAndWait();
		AqualityServices.getElementFactory().getButton(By.xpath("//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/a[1]"),
				"Switch settings").clickAndWait();
	}		
	
	public void saveSettings() {
		AqualityServices.getElementFactory().getButton(By.xpath("//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[2]/div[4]/button[2]"), "Save changes").clickAndWait();
	}
	
	public void customSwitchSize() {
		IButton custom = AqualityServices.getElementFactory().getButton(By.xpath("//span[@class='active' and contains(text(), 'Custom')]"), 
				"Custom");
		custom.getJsActions().scrollIntoView();
		custom.clickAndWait();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) AqualityServices.getBrowser().getDriver();
        jsExecutor.executeScript("document.querySelector('.wppool-slider').setAttribute('data-value', '" + 220 + "');");   
        jsExecutor.executeScript("document.getElementById('wp_dark_mode_switch[switcher_scale]').value = '" + 220 + "';");
        AqualityServices.getElementFactory().getButton(By.xpath("//div[@class='wppool-slider-handle ui-slider-handle ui-corner-all ui-state-default']"), "Slider Handle").click();
	}
	
	public void changeFloatingSwitchPosition() {
		WebElement dropDownElement = AqualityServices.getBrowser().getDriver().findElement(By.id("wp_dark_mode_switch[switcher_position]"));
	    Select dropDown = new Select(dropDownElement);
	    dropDown.selectByValue("left_bottom");	    
	}	
}