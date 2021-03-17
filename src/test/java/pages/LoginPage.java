package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
@FindBy(name="email")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(xpath="//div[contains(@class, 'ui fluid large blue submit button')]")
WebElement loginBtn;

@FindBy(linkText = "Forgot your password?")
WebElement forgotLink;


public LoginPage() {
	
	PageFactory.initElements(driver, this);
}


public void login(String strName, String strPwd) {
	username.sendKeys(strName);
	password.sendKeys(strPwd);
	loginBtn.click();
}

public String getPageTitle() {
	String pgtitle=driver.getTitle();
	return pgtitle;
}
}
