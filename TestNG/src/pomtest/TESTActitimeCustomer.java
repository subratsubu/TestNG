package pomtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.POMActitimeCustomerPage;
import pom.POMActitimeLoginPage;

public class TESTActitimeCustomer 
{
	@Test
	public void customer()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
		
		POMActitimeCustomerPage customer=new POMActitimeCustomerPage(driver);
		customer.customerMethod();
	}
}