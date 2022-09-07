package A_cucmber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Examplecucumber {
	public static WebDriver wd;
	
	@Given("Lanch the Browser")
	public void lanch_the_browser(String String) {
		WebDriverManager.chromedriver().setup();
		   wd = new ChromeDriver();
		   wd.manage().window().maximize();
		   wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Lanch the maximize")
	public void lanch_the_maximize(String String) {
		  wd.manage().window().maximize();
		   wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Lanch the Url as {string}")
	public void lanch_the_url_as(String URL) {
		 wd.get(URL);
	}

	@When("put the valid username as {string}")
	public void put_the_valid_username_as(String username) {
		 WebElement user= wd.findElement(By.xpath("//*[@name='username']"));
		  user.sendKeys(username);
	}

	@When("put the valid password as {string}")
	public void put_the_valid_password_as(String pass) {
		WebElement password = wd.findElement(By.name("password"));
		  password.sendKeys(pass);
	}

	@Then("click the login button")
	public void click_the_login_button() {
		 WebElement login =wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button"));
		  login.click();
	}

}
