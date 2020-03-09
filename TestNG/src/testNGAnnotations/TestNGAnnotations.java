package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@Test
	public void chicago()
	{
		Reporter.log("chicago",true);
	}
	
	@Test
	public void lasvegas()
	{
		Reporter.log("lasvegas",true);
	}
	
	@BeforeClass
	public void sandiego()
	{
		Reporter.log("sandiego",true);
	}
	
	@BeforeMethod
	public void philadelphia()
	{
		Reporter.log("philadelphia",true);
	}
	
	@BeforeSuite
	public void losangeles()
	{
		Reporter.log("losangeles",true);
	}
	
	@BeforeTest
	public void sanantonio()
	{
		Reporter.log("sanantonio",true);
	}
	
	@AfterSuite
	public void daringbadi()
	{
		Reporter.log("daringbadi",true);
	}
	
	@AfterMethod
	public void vssnagar()
	{
		Reporter.log("vssnagar",true);
	}
	
	@AfterClass
	public void maharaja()
	{
		Reporter.log("maharaja",true);
	}
	
	@AfterTest
	public void patia()
	{
		Reporter.log("patia",true);
	}
}
