package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	
	WebDriver driver;
	
	By email = By.xpath("//input[@type='email']");
	By nextButton = By.xpath("//input[@type='submit']");
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement next()
	{
		return driver.findElement(nextButton);
	}
	/*public static void get()
	{
		System.out.println(""HELO);
	}
	
	lsaglkkfds;
	sgfoj;jsljg
	fgj;lfsdj
	f;g;djs
	lfsgj;sdjg
	sfglsdgh
	assdl;f;agiu
	jhglsdfh
	aghlsdfhl
	*/
	
	//mahesh
	//What are You doing?
	//I am doing Automation Testing
	//I love to make test cases
	//I love this
}