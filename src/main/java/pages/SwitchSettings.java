package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;

public class SwitchSettings {
	
	public void changeFloatingSwitchStyle() {
		AqualityServices.getElementFactory().getButton(By.xpath("//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[2]/div[3]/div/section/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div"),
				"Switch Style").click();
	}
	
	public void floatingSwitchSize() {
//		IButton custom = AqualityServices.getElementFactory().getButton(By.xpath("//span[@class='active' and contains(text(), 'Custom')]"),
//				"Custom");
//		custom.getJsActions().scrollIntoView();
//		custom.clickAndWait();
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) AqualityServices.getBrowser().getDriver();
//        jsExecutor.executeScript("document.querySelector('.wppool-slider').setAttribute('data-value', '" + 220 + "');");
//        jsExecutor.executeScript("document.getElementById('wp_dark_mode_switch[switcher_scale]').value = '" + 220 + "';");
        AqualityServices.getElementFactory().getButton(By.xpath("//span[contains(text(), 'XXL')]"), "Floating Switch Custom Size").click();
	}
	
	public void changeFloatingSwitchPosition() {
		AqualityServices.getElementFactory().getButton(By.xpath("//span[contains(text(), 'Left')]"), "Floating switch position").clickAndWait();
	}	
	
	public void gotoAccessibilitySettings() {
		AqualityServices.getElementFactory().getButton(By.xpath("//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[1]/div[2]/div[3]/div/div[1]/div/h4"), "Advanced Button").clickAndWait();
		AqualityServices.getElementFactory().getButton(By.xpath("//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[1]/div[2]/div[3]/div/div[2]/a[4]"), "Accessibility Settings").click();;
	}
}