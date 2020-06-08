import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.horolab.qa.base.BaseTest;
import com.horolab.qa.pages.HomeLoginPage;
import com.horolab.qa.pages.LoginPage;

public class HomeLoginPageTest extends BaseTest{

	HomeLoginPage homeLoginPage;
	LoginPage loginPage;
	
	public HomeLoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homeLoginPage = new HomeLoginPage();
	}
	
	@Test
	public void verifyLogin() {
		loginPage = homeLoginPage.login();
		System.out.println("inside verify login");
		
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
}
