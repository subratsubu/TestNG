package pomtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.POMActitimeLoginPage;

public class TESTActitimeLogin 
{
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
	}
}