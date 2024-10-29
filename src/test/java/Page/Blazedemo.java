package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemo {
	WebDriver driver;
	By blaname=By.id("name");
	By blacompany=By.id("company");
	By blaemail=By.id("email");
	By blapassword=By.id("password");
	By blaconfirm=By.id("password-confirm");
	By blareg=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	public  Blazedemo(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setValues(String name,String company,String email,String password,String confirm)
	{
		driver.findElement(blaname).sendKeys(name);
		driver.findElement(blacompany).sendKeys(company);
		driver.findElement(blaemail).sendKeys(email);
		driver.findElement(blapassword).sendKeys(password);
		driver.findElement(blaconfirm).sendKeys(confirm);
	}
	public void register()
	{
		driver.findElement(blareg).click();
	}
}
