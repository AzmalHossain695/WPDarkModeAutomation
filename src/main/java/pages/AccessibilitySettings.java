package pages;

import org.openqa.selenium.By;
import aquality.selenium.browser.AqualityServices;

public class AccessibilitySettings {
	
	public void disableKeyboardShortcut() {
		AqualityServices.getElementFactory().getButton(By.xpath("//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[2]/div[3]/div/div[6]/div[1]/label/div[1]/div/span"),
				"Disable keyboard shortcut").clickAndWait();
	}
	
	public void gotoAnimationSettings() {
		AqualityServices.getElementFactory().getButton(By.xpath("//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/a[5]"), "Animation Settings").click();;
	}
}