package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Blazedemo;

public class BlazedemoTest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver= new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test1()
	{
		Blazedemo ob=new Blazedemo(driver);
		ob.setValues("Anju", "Glb", "anju@gmail.com", "Anju@56", "Anju@56");
        ob.register();
	}
}
