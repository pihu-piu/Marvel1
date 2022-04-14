package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;
	

		
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();

	}
	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
	   driver.get(url);
	}

	@When("User enters login Email as {string} and Password as {string}")
	public void user_enters_login_Email_as_and_Password_as(String uname, String pwd) {
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("Click on Login")
	public void click_on_Login() {
		driver.findElement(By.id("loginButton")).click();
	}

	@When("User get message")
	public void user_get_message()  throws Exception{
		try {
		String Alert= driver.switchTo().alert().getText();
		System.out.println("Alert message..."+Alert);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
		



}
