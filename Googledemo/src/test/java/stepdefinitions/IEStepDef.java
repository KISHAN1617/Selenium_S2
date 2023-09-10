package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.cucumber.java.en.Given;

public class IEStepDef {
	WebDriver driver;
	@Given("I am on the IE browser")
	public void i_am_on_the_ie_browser() {
	driver=new InternetExplorerDriver();
	driver.get("https://www.google.com/");

	}

}
