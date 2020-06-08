import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.horolab.qa.base.BaseTest;
import com.horolab.qa.pages.HomeLoginPage;
import com.horolab.qa.pages.LoginPage;
import com.horolab.qa.util.TestUtil;

public class LoginPageTest extends BaseTest{
// To access all the WebElements and methods of Login Page we need to create the object of LoginPage class
	LoginPage loginPage;
	HomeLoginPage homeLoginPage;
	TestUtil testUtil;
	String sheetName = "login";
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homeLoginPage = new HomeLoginPage();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		
	}
	
	@DataProvider
	public Object[][] getLoginTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider = "getLoginTestData")
	public void verifyLogin(String username, String password) {
		System.out.println("inside login Stest");
		loginPage = homeLoginPage.login();
		loginPage.userLogin(username, password);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
