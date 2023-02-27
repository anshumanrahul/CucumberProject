package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Dropdown {

	public static WebDriver driver; 
	
	@SuppressWarnings("deprecation")
	@Given("^User navigate to Select Country Dropdown screen$")
	public void DropdownPractice()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
	}
	@And("^User click on country Dropdown and to select the value$")
	public void SelectValuefromDropdown()
	{
		//WebElement d=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
		select.selectByIndex(4);
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		driver.quit();
		
		
	}

}
