package lastclsprogram;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POMFramework extends BasePage implements AutoConstant
{
	    @FindBy(xpath="(//input[@type='text'])[1]")
		private WebElement firstnameTextfield;
		
		@FindBy(xpath="(//input[@type='radio'])[1]")
		private WebElement maleRadioButton;
		
		@FindBy(xpath="//input[@type='checkbox']")
		private WebElement rememberMeCheckbox;
		
		@FindBy(xpath="//select[@name='countrycode']")
		private WebElement countryCodeDropDownList;
		
		@FindBy(xpath="(//input[@type='text'])[5]")
		private WebElement mobileNoTextfield;
		
		public POMFramework(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void submit() throws IOException
		{
			firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
			maleRadioButton.click();
			rememberMeCheckbox.click();
			selectbyvisibletext(countryCodeDropDownList, "+33");
			mobileNoTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 5));
		}

}
