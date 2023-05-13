package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
	super(driver);
}

@FindBy(id="input-email")WebElement email_input;
@FindBy(id="input-password")WebElement password_input;
@FindBy(xpath=" //button[normalize-space()='Login']")WebElement login_button;

public void setEmail(String email)
{
	email_input.sendKeys(email);
}
public void setPassword(String password)
{
	password_input.sendKeys(password);
}
public void clickonLogin()
{
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",login_button);
}
}