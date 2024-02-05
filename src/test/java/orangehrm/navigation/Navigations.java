package orangehrm.navigation;

import net.serenitybdd.core.steps.UIInteractions;
import orangehrm.pages.LoginPage;

public class Navigations extends UIInteractions {
	//
	LoginPage login;
	//
	@Step("Navigate to login page")
	public void openLoginPage() {
		openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
