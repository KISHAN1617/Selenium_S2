package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	@FindBy(name="q")
	static WebElement Searchbox;
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
	static WebElement submit;
	public LandingPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void SearchBox(String s)
	{
	Searchbox.sendKeys(s);
	}
	public void ClicksearchBox()
	{
	submit.submit();
	}


}
