package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import aquality.selenium.browser.AqualityServices;
import utils.ConfigDataUtills;

public class AnimationSettings {
	
	public void enablePageTransitionAnimationAndChangeAnimationEffect() {
		AqualityServices.getElementFactory().getButton(By.xpath("//*[@id=\"wp-dark-mode-admin\"]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/label/div[1]/div/span"),
				"Enable Page transition animation").clickAndWait();
		AqualityServices.getElementFactory().getButton(By.xpath("//span[contains(text(), 'Flip')]"), "Animation style");
	}
	
	public void gotoFrontend() {
		AqualityServices.getBrowser().getDriver().get("http://localhost:10004/");
	}
}