package demo.LoginGithub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args)
	{
		
	
	try{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
		driver.get("http://www.github.com");
		
		
		
			WebElement imagesLink=driver.findElements(By.linkText("Sign in")).get(0);
						imagesLink.click();
						
						WebElement username=driver.findElement(By.id("login_field"));
						username.sendKeys("chamundeswari.sirisipalli@capgemini.com");
						
						WebElement password=driver.findElement(By.id("password"));
						password.sendKeys("chamu25595");
						
						WebElement commit = driver.findElements(By.className("btn")).get(0);
						commit.click(); 


	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
