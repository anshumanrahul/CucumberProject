package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClickCountCapture {
	
	public static WebDriver driver;
	
	@Given("^User Launch the Mouse Over webpage$")
	public void LaunchthePage()
	{
		driver=new ChromeDriver();
		driver.get("http://uitestingplayground.com/mouseover");
	}
	@When("^User Click on click me link capture the click count$")
	public void ClickonClickmeLink() throws Throwable
	{
		for (int i = 0; i < 10; i++){
			WebElement clcikmelink=driver.findElement(By.xpath("//a[contains(text(),'Click me')]"));
			clcikmelink.click();
			  Thread.sleep(2000);
			  WebElement clickcount=driver.findElement(By.xpath("//*[@id=\"clickCount\"]"));
				
				System.out.println("Number of click Count is: " + clickcount.getText());
			 }
			
	}
	@Then("^Print Success Message and close the browser$")
	public void captureclickcount()
	{
		
		System.out.println("CLick Count task is successful");
		driver.quit();
	}

}
