package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class SharedSteps {
	WebDriver d;
	@Before
	public void seiup()
	{
	d=new ChromeDriver();
	}
	public WebDriver getDriver()
	{
	return d;
	}
	@After
	public void tearDown()
	{
	d.close();
	}

}
