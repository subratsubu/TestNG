package pomtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.POMActitimeLoginPage;
import pom.POMActitimeWorkPage;

public class TESTActitimeWork 
{
	@Test
	public void work() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
		
		POMActitimeWorkPage work=new POMActitimeWorkPage(driver);
		work.workMethod();
	}
}