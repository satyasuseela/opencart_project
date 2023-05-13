package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myaccount extends BasePage

{
	public Myaccount(WebDriver driver)
	{
		super(driver);
		
	}
WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
@FindBy(xpath="//a[@class='list-group-item'][text()='My Account']")WebElement my_account;
@FindBy(xpath="//a[@class='list-group-item'][text()='Logout']")WebElement logout;
public boolean Account()
{
boolean status=myWait.until(ExpectedConditions.visibilityOf(my_account)).isDisplayed();
return status;
}
public void signOff()
{
	logout.click();
}
}