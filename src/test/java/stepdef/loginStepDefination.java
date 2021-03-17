package stepdef;





import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class loginStepDefination extends TestBase {

	LoginPage loginpage;
	
	@Given("User is already on login page")
	public void user_is_already_on_login_page() {
		initialize();
	}

	
	
	
	
	@When("User enter login credentials")
	public void user_enter_login_credentials(DataTable userCred) {
		List<Map<String, String>> data= userCred.asMaps();
		loginpage = new LoginPage();
		loginpage.login(data.get(0).get("username"),data.get(0).get("password"));
	    
	}
	
	@Then("User is on Home Page")
	public void user_is_on_Home_Page() {
	  String pageTitle = loginpage.getPageTitle();
	  Assert.assertEquals("Cogmento CRM", pageTitle);
	}

	@Then("Close browser")
	public void close_browser() {
	    driver.close();
	}

}
