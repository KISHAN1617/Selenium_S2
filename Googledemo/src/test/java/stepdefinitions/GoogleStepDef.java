package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;

public class GoogleStepDef {
	WebDriver driver;
	@Given("I am on the chrome browser")
	public void i_am_on_the_chrome_browser() {
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	}

}
