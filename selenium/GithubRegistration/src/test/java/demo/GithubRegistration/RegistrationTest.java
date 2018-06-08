package demo.GithubRegistration;

import demo.GithubRegistration.RegistrationPage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
public class RegistrationTest {


	static WebDriver driver;
	private RegistrationPage loginPage;
	
	@BeforeClass
	public static void setUpDriverEnv(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Before
	public void setUpTestEnv() {
		driver.get("https://github.com/");
		loginPage= new RegistrationPage();
		PageFactory.initElements(driver, loginPage);
	}
	
	
	@Test
	public void testForBlankUserNameAndPassword(){	
		loginPage.setUsername("");
		loginPage.setEmailID("");
		loginPage.setPassword("");
		loginPage.clickSubmitButton();
		//String actualErrorMessage=driver.findElement(By.xpath("//div[@class='container']")).getText();	
		//System.out.println("error Message :- "+actualErrorMessage);
		//String expectedErrorMessage="Incorrect username or password.";
		//Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	}
	
@Test
	public void testForInValidUserName(){
		
		loginPage.setUsername(getInvalidUserName());
		loginPage.setPassword(getValidPassword());
		loginPage.setEmailID(getValidEmailID());
		loginPage.clickSubmitButton();
		String expectedErrorMessage="Incorrect username or password.";
		/*String actualErrorMessage=driver.findElement(By.xpath("//div[@class='container']")).getText();	
		System.out.println("error Message :- "+actualErrorMessage);
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);*/
	}

	@Test
	public void testForInValidPassword(){
		loginPage.setUsername(getValidUserName());
		loginPage.setPassword(getInvalidPassword());
		loginPage.setEmailID(getValidEmailID());
		loginPage.clickSubmitButton();
		
		String expectedErrorMessage="Incorrect username or password.";
		/*String actualErrorMessage=driver.findElement(By.xpath("//div[@class='container']")).getText();	
		System.out.println("error Message :- "+actualErrorMessage);
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);*/
	}
	
	@Test
	public void testForInValidEmailID(){
		loginPage.setUsername(getValidUserName());
		loginPage.setPassword(getValidPassword());
		loginPage.setEmailID(getInvalidEmailID());
		loginPage.clickSubmitButton();
		
		String expectedErrorMessage="Incorrect username or password.";
		/*String actualErrorMessage=driver.findElement(By.xpath("//div[@class='container']")).getText();	
		System.out.println("error Message :- "+actualErrorMessage);
		
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);*/
	}
	
	@Test
	public void testForInValidUserNameAndPasswordAndEmailID(){
		loginPage.setUsername(getInvalidUserName());
		loginPage.setPassword(getInvalidPassword());
		loginPage.setEmailID(getInvalidEmailID());
		loginPage.clickSubmitButton();
		
		
		String expectedErrorMessage="Incorrect username or password.";
		/*String actualErrorMessage=driver.findElement(By.xpath("//div[@class='container']")).getText();	
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);*/
	}
	
	
	@Test
	public void testForValidUserNameAndPassword(){
		loginPage.setUsername(getValidUserName());
		loginPage.setPassword(getValidPassword());
		loginPage.setEmailID(getValidEmailID());
		loginPage.clickSubmitButton();
		//String actualHostName =driver.findElement(By.xpath("//meta[@name='hostname']")).getAttribute("content");	
		//String actualUserName=driver.findElement(By.xpath("//meta[@name='user-login']")).getAttribute("content");
		
		//String expectedUserName="satishmahajan11";
		
		/*HostAndUserDetails expectedUserDetails = new HostAndUserDetails("github.com", "satishmahajan11");
		HostAndUserDetails actualUserDetails = new HostAndUserDetails(actualHostName, actualUserName);*/
		//Assert.assertEquals(expectedUserName, actualUserName);
	}
	@After
	public void tearDownTestEnv(){
		loginPage= null;
	}
	@AfterClass
	public static void tearDownDriverEnv(){
		driver.close();
		driver=null;
	}
	
	private String getInvalidUserName() {
		return "Chamu";
	}
	
	private String getValidUserName() {
		return "Chamubadri25";
	}
	
	private String getInvalidPassword() {
		return "12345";
	}
	
	private String getValidPassword() {
		return "Chamu@12345";
	}
	
	private String getInvalidEmailID() {
		return "123@gmail.com";
	}
	
	private String getValidEmailID() {
		return "badri1794@gmail.com";
	}
}

