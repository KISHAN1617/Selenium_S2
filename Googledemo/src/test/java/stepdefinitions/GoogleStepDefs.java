package stepdefinitions;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;


public class GoogleStepDefs {
	WebDriver d;
	LandingPage p;
	SharedSteps s;
	public GoogleStepDefs ()
	{
	this.s=s;
	}
	@Given("I am on the Search button")
	public void i_am_on_the_search_button() {
	d=new ChromeDriver();
	d.get("https://google.com/");
	d.manage().window().maximize();
	}
	@When("I type {string} in Search button")
	public void i_type_in_search_button(String searchText) {
	p=new LandingPage(d);
	p.SearchBox(searchText);
	}
	@When("I click on the Search button")
	public void i_click_on_the_search_button() throws InterruptedException {
	Thread.sleep(3000);
	p=new LandingPage(d);
	p.ClicksearchBox();
	}
	@Then("should get results for {string}")
	public void should_get_results_for(String string) {
	d.getTitle();
	}


}
