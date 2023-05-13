package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage

{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

@FindBy(xpath="//span[text()='My Account']")WebElement button_account;


@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Login']")WebElement login_button;
public void myAccount()
{
	button_account.click();
}


public void clickonLogin()
{
	login_button.click();
}}