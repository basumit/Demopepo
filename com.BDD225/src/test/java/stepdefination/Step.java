package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

	WebDriver driver=null;
	@Given("^user on login page$")
	public void user_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("file:///C:/seleniumsoftware/Offline%20Website/Offline%20Website/index.html");
		
	  	}

	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
         driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_dashboard_page() throws Throwable {
	 Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}

	@Then("^user click on users tab$")
	public void user_click_on_users_tab() throws Throwable {
       driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
	}
	@Then("^user Click on adduser tab$")
	public void user_Click_on_adduser_tab() throws Throwable {
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
}
	@Then("^user enters valid credential$")
	public void user_enters_valid_credential() throws Throwable {
	    driver.findElement(By.id("username")).sendKeys("sumit bhosale");
	    driver.findElement(By.id("mobile")).sendKeys("12345");
	    driver.findElement(By.id("email")).sendKeys("sumitbhosale299@gmail.com");
	    driver.findElement(By.id("course")).sendKeys("java");
	    driver.findElement(By.id("Male")).click();
	WebElement we=    driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
	     Select sc=new Select(we);
	     sc.selectByIndex(1);
	     driver.findElement(By.id("password")).sendKeys("12345678");
	   
	    
	    driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("2345565");
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	    Alert alert=driver.switchTo().alert();
}
	@Then("^user verify list box$")
	public void user_verify_list_box() throws Throwable {
		for (int i = 2; i < 4; i++) {
		for (int j = 2; j < 8; j++) {
			
	
	    String xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]";
	   //  System.out.println(xpath);
	     String name=driver.findElement(By.xpath(xpath)).getText();
	     System.out.println(name);
	}
		}	
	}

}