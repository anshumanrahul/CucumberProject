package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps {
	
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practicetestautomation.com/practice-test-login/");
		}


	@When("^User Navigate to LogIn Page and User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
		}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		WebElement Actual=driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"));
        System.out.println(Actual.getText());
	}

	@Then("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		 driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	        System.out.println("Successfully Logged out");
	        driver.quit();
	        
	}


}
