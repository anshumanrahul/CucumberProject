package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddRemoveItems {

	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Given("^User is on Add/Remove Elements screen$")
	public void Add_Remove_Elements() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
	}

	@When("^User click on Add Element button$")

	public void AddElementsButtonClick() throws Exception {
		WebElement AddButton=driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
		
		if(AddButton.isDisplayed())
		{
			System.out.println("Add Element button is displayed");
			Thread.sleep(3000);
			AddButton.click();
		}
		
		else
		{
			System.out.println("Add Element button is not displayed");
		}
	}
@Then("^Delete button should get displayed$")
public void DeleteButtonDisplayed()
{
	WebElement Deletebutton=driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
	if(Deletebutton.isDisplayed())
	{
		System.out.println("Delete button is displayed");
		
	}
	else
	{
		System.out.println("Delete button not displayed");
	}
	driver.quit();
}
}
