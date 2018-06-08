package demo.Login;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import demo.Login.PageLogin;
public class LoginPageTest {

		static WebDriver driver;
		private PageLogin loginPage;
		
		@BeforeClass
		public static void setUpDriverEnv()
		{ 
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		
		public void setUpTestEnv()
		{
			driver.get("http://github.com/login");
			PageLogin = new PageLogin();
			PageFactory.initElements(driver,loginPage);
			
		}
		
		@Test
		public void testForBlankUserNameAndPassword()
		{
			
		}
		
}
