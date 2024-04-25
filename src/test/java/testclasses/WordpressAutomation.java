package testclasses;

import aquality.selenium.browser.AqualityServices;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import utils.*;
import pages.*;

public class WordpressAutomation extends BaseTest {
	LoginUtils login = new LoginUtils();
	Dashboard dashboard = new Dashboard();
	GeneralSettings generalSettings = new GeneralSettings();
	SwitchSettings switchSettings = new SwitchSettings();
	AccessibilitySettings accessibilitySettings = new AccessibilitySettings();
	AnimationSettings animationSettings = new AnimationSettings();
	FrontEnd frontEnd = new FrontEnd();

	@Test
	public void WPAutomation() {
		login.login();
		boolean isDarkModeActivated = dashboard.getWPDarkModeButton().state().isDisplayed();
		if (!isDarkModeActivated) {
			if (!dashboard.isWPDarkModeInstalled()) {
				dashboard.installAndActivateDarkMode();
			}
			dashboard.activateDarkMode();
		}
		dashboard.navigateToWPDarkMode();
		generalSettings.enableAdminPanelDarkMode();
		generalSettings.saveSettings();
		generalSettings.navigateToDashboard();
		Assert.assertTrue(dashboard.getWPDarkModeButton().state().isDisplayed(), "Dark Mode is not working");
		dashboard.navigateToWPDarkMode();
		generalSettings.gotoSwitchSettings();
		switchSettings.changeFloatingSwitchStyle();
		generalSettings.saveSettings();
		generalSettings.gotoSwitchSettings();
		switchSettings.floatingSwitchSize();
		generalSettings.saveSettings();
		dashboard.navigateToWPDarkMode();
		generalSettings.gotoSwitchSettings();
		switchSettings.changeFloatingSwitchPosition();
		generalSettings.saveSettings();
		switchSettings.gotoAccessibilitySettings();
		accessibilitySettings.disableKeyboardShortcut();
		generalSettings.saveSettings();
		accessibilitySettings.gotoAnimationSettings();
		animationSettings.enablePageTransitionAnimationAndChangeAnimationEffect();
		generalSettings.saveSettings();
		animationSettings.gotoFrontend();
		Assert.assertTrue(frontEnd.isDarkModeWorking(), "Dark Mode is not working in front end");
	}
}
