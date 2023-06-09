package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseClass {

public static WebDriver driver;
public ResourceBundle rb;
public Logger logger;

@Parameters({"browser"})
@BeforeClass
public void setup(String br)
{
	
	rb=ResourceBundle.getBundle("config");
	logger=LogManager.getLogger(this.getClass()); 
	
	if(br.equals("chrome"))
	{
		driver=new ChromeDriver();	
	}
	else 
	{
		driver=new EdgeDriver();
	}


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

driver.get(rb.getString("appURL"));
driver.manage().window().maximize();
}
@AfterClass
public void tearDown()
{
	driver.quit();
}
public String randomeString()
{
	String generatedString=RandomStringUtils.randomAlphabetic(5);
	return(generatedString);
}

public String randomeNumber()
{
	String generatedString2=RandomStringUtils.randomNumeric(10);
	return(generatedString2);
}
public String randomAlphaNumeric()
{
	String st=RandomStringUtils.randomAlphabetic(4);
	String num=RandomStringUtils.randomNumeric(3);
	return(st+"@"+num);
	
}

public String captureScreen(String tname) throws IOException {

	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

	try {
		FileUtils.copyFile(source, new File(destination));
	} catch (Exception e) {
		e.getMessage();
	}
	return destination;

}


}








