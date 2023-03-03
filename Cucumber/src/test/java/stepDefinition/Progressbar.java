package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.xml.stream.events.StartDocument;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Progressbar {
	
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("^Navigate to Progress Bar screen$")
	public void navigateToProgressbarscreen()
	{
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://uitestingplayground.com/progressbar");
	}
	@And("^Start and Stop button is getting displayed$")
	public void VerifyStartStopButton()
	{
		WebElement start=driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
		WebElement stop=driver.findElement(By.xpath("//button[contains(text(),'Stop')]"));
		if(start.isDisplayed())
		{
			System.out.println("Start button is displayed");
		}
		else
		{
			System.out.println("Start button is not displayed");
		}
		if(stop.isDisplayed())
		{
			System.out.println("Stop button is displayed");
		}
		else
		{
			System.out.println("Stop button is not displayed");
		}
	}
	
	@When("^I click on start button$")
	public void clickonStartbutton()
	{
		WebElement start=driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
		start.click();
	}
	@Then("^progress bar reached 50% click on stop button$")
	public void Progressbarreachedhalf()
	{
		WebElement progressBar=driver.findElement(By.xpath("//*[@id=\"progressBar\"]"));
		WebElement stop=driver.findElement(By.xpath("//button[contains(text(),'Stop')]"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		boolean progressstatus= wait.until(ExpectedConditions.attributeContains(progressBar, "aria-valuenow", "50"));
		
		if(progressstatus==true)
		{
			stop.click();
		}
	}

}
