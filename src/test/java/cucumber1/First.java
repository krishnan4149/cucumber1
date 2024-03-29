package cucumber1;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class First {
	static WebDriver driver;
	@Given("User should launch brower")
	public void user_should_launch_brower() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishnan\\eclipse-workspace\\cucumber1\\div\\chromedriver.exe");
	     driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user click and customer like")
	public void user_click_and_customer_like() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		
}

	//@When("user provide vaid details")
	//public void user_provide_vaid_details() {
		//driver.findElement(By.xpath("//label[text()='Done']")).click();  
		//driver.findElement(By.id("fname")).sendKeys("krishnan");
		//driver.findElement(By.id("lname")).sendKeys("Don");
		//driver.findElement(By.id("email")).sendKeys("krishnan4149@gmail.com");
		//driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Chennai");
		//driver.findElement(By.id("telephoneno")).sendKeys("9566527628");
		//driver.findElement(By.xpath("//input[@name='submit']")).click();

	//}
	/*@When("user provide vaid details{string},{string},{string},{string},{string}")
	public void user_provide_vaid_details(String fname, String lname, String email, String address, String phone) {
		driver.findElement(By.xpath("//label[text()='Done']")).click();  
		driver.findElement(By.id("fname")).sendKeys("krishnan");
		driver.findElement(By.id("lname")).sendKeys("Don");
		driver.findElement(By.id("email")).sendKeys("krishnan4149@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("9566527628");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
}*/
	//One Dimensional List
	
	/*@When("user provide vaid details")
	public void user_provide_vaid_details(io.cucumber.datatable.DataTable dataTable) {
		List<String>onedimen = dataTable.asList(String.class);
		 	driver.findElement(By.xpath("//label[text()='Done']")).click();
		    driver.findElement(By.id("fname")).sendKeys(onedimen.get(0));
		    driver.findElement(By.id("lname")).sendKeys(onedimen.get(1));
		    driver.findElement(By.id("email")).sendKeys(onedimen.get(2));
		    driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(onedimen.get(3));
		    driver.findElement(By.id("telephoneno")).sendKeys(onedimen.get(4));
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
	}*/
	
	//One Dimensional Map
	
	/*@When("user provide vaid details")
	public void user_provide_vaid_details(io.cucumber.datatable.DataTable dataTable) {
			Map<String, String>onedieMap = dataTable.asMap(String.class,String.class);
			driver.findElement(By.xpath("//label[text()='Done']")).click();
		    driver.findElement(By.id("fname")).sendKeys(onedieMap.get("fname"));
		    driver.findElement(By.id("lname")).sendKeys(onedieMap.get("lname"));
		    driver.findElement(By.id("email")).sendKeys(onedieMap.get("gmail"));
		    driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(onedieMap.get("address"));
		    driver.findElement(By.id("telephoneno")).sendKeys(onedieMap.get("phno"));
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
	*/
	//Two Dimensional List
	
	/*   @When("user provide vaid details")
	public void user_provide_vaid_details(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>>twodimen = dataTable.asLists(String.class);
		System.out.println(twodimen);
		driver.findElement(By.id("rental1")).sendKeys(twodimen.get(0).get(2));
		driver.findElement(By.id("local_minutes")).sendKeys(twodimen.get(0).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(twodimen.get(0).get(3));
		driver.findElement(By.id("sms_pack")).sendKeys(twodimen.get(0).get(2));
		driver.findElement(By.id("minutes_charges")).sendKeys(twodimen.get(0).get(2));
		driver.findElement(By.id("inter_charges")).sendKeys(twodimen.get(0).get(1));
		driver.findElement(By.id("sms_charges")).sendKeys(twodimen.get(0).get(2));
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	   
	}*/
	
	//TwoDimensional Map
	
	
	
	
	@When("user provide vaid details")
	public void user_provide_vaid_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>>twodieMap = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(twodieMap.get(0).get("Monthly"));
		driver.findElement(By.id("local_minutes")).sendKeys(twodieMap.get(0).get("Local"));
		driver.findElement(By.id("inter_minutes")).sendKeys(twodieMap.get(0).get("International"));
		driver.findElement(By.id("sms_pack")).sendKeys(twodieMap.get(0).get("SMS"));
		driver.findElement(By.id("minutes_charges")).sendKeys(twodieMap.get(0).get("Local Per"));
		driver.findElement(By.id("inter_charges")).sendKeys(twodieMap.get(0).get("International Per"));
		driver.findElement(By.id("sms_charges")).sendKeys(twodieMap.get(0).get("SMS Per"));
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		
		
		
	   
	}


	
     @Then("to verife the customer id is displayed")
	public void to_verife_the_customer_id_is_displayed() {
	Assert.assertTrue(driver.findElement(By.xpath("//input[@value='submit']")).isDisplayed());
	    
	}



}
