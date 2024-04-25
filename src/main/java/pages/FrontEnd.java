package pages;

import org.openqa.selenium.By;
import aquality.selenium.browser.AqualityServices;

public class FrontEnd {
	
	public boolean isDarkModeWorking() {
		return AqualityServices.getElementFactory().getButton(By.xpath("/html/body/div[3]/div/div/div/div[1]/svg"),
				"Dark Mode Button").state().isDisplayed();
	}
}