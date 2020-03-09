package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeCustomerPage 
{
public WebDriver driver;
	
	@FindBy(id="container_tasks")
	private WebElement taskLink;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomerLink;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement customerNameTextfield;
	
	@FindBy(xpath="//div[@class='components_button  withPlusIcon']")
	private WebElement createCustomerButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	public POMActitimeCustomerPage(WebDriver driver)
	{
		this.driver=driver;	//selenium get an ambiguity which driver to load so was throwing NULLPOINTEREXCEPTION
		PageFactory.initElements(driver, this);
	}
	
	public void customerMethod()
	{
		taskLink.click();
		addNewButton.click();
		newCustomerLink.click();
		customerNameTextfield.sendKeys("qspiders");
		createCustomerButton.click();
	}

}
