package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scrollbar {
	
	public static WebDriver driver;
	
	@Given("^User navigates to Scrolling Website$")
	public void LaunchScrollingwebsite()
	{
		driver=new ChromeDriver();
		driver.get("http://uitestingplayground.com/scrollbars");
	}
	@When("^User try to scroll vertically$")
	public void scrollvertically()
	{
		driver.findElement(By.xpath("/html/body/section/div/div")).click();
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		System.out.println("Vertical Scroll Success");
		
	}
	@Then("^Print message as vertically scroll successful$")
	public void scrollverticallysuccessfulmessage()
	{
		System.out.println("Vertically scrolled successful.");
		
	}
	
	@When("^User try to scroll horizontally$")
	public void scrollhorizontally()
	{
		driver.findElement(By.xpath("/html/body/section/div/div")).click();
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ARROW_RIGHT).build().perform();
		ac.sendKeys(Keys.ARROW_RIGHT).build().perform();
		System.out.println("Horizontal Scroll Success");
		
	}
	@Then("^Print message as horizontal scroll successful$")
	public void scrollhorizontalsuccessfulmessage()
	{
		System.out.println("Horizontal scrolled successful.");
		
	}

}
