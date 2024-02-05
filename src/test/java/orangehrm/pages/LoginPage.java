package orangehrm.pages;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class LoginPage extends PageObject{
	public static final By USERNAME_FIELD = By.name("usernmae");
	public static final By PASSWORD_FIELD = By.name("password");
	public static final By LOGIN_BUTTON = By.className("osd-button");
	
	public void loginToOrangeHrm(String username, String password) {
		USERNAME_FIELD.
	}

}
