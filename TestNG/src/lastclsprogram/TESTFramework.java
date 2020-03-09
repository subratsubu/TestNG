package lastclsprogram;

import java.io.IOException;
import org.testng.annotations.Test;
import generics.BaseTest;

public class TESTFramework extends BaseTest
{
	@Test
	public void enter() throws IOException
	{
		POMFramework p=new POMFramework(driver);
		p.submit();
	}	

}
