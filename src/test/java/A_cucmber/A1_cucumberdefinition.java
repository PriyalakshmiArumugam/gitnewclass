package A_cucmber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_cucumberdefinition {
	WebDriver wd;
	@Given("launch browser as {string}")
	public void launch_browser_as(String string) {
	   WebDriverManager.chromedriver().setup();
	   wd = new ChromeDriver();
	   wd.manage().window().maximize();
	}

	@Given("get url as {string}")
	public void get_url_as(String url) {
	  wd.get(url);
	}

	@When("enter username as  {string}")
	public void enter_username_as(String user) {
		 WebElement username= wd.findElement(By.xpath("//*[@name='username']"));
		  username.sendKeys("priyalakshmi");
	}

	@When("enter password as {string}")
	public void enter_password_as(String string) {
		 WebElement password = wd.findElement(By.name("password"));
		  password.sendKeys("priya12345");
	}

	@When("click button")
	public void click_button() {
		 WebElement login =wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button"));
		  login.click();
	}

	@Then("check")
	public void check() {
	    System.out.println("yes");
	}


}
