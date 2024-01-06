package Stepdefination;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.util.List;

import com.microsoft.playwright.Page;

import Main.Base;
import io.cucumber.java.en.*;

public class demoblaze<WebElement> {
	
	
	static Page page = Base.initBrowser("chromium");
	public static List LT;
	
	@Given("User open the demoblaze")
	public void user_open_the_demoblaze() {
		scenariocontext.setCurrentPage(page);
		page.navigate("https://qavbox.github.io/demo/");
		assertThat(page).hasTitle("QAVBOX Demo");
	       
	    
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	//	page.locator("#login2").click();
		
	LT=   page.locator("//ul[@class='myhmenu']//li//a").allTextContents();
	   
	}

	@Then("User Enter the details and login")
	public void user_enter_the_details_and_login() {
		
/*page.locator("#loginusername").fill("pavanol");
	    page.locator("#loginpassword").fill("test@123");
	     page.locator("//button[text()='Log in']").click();*/
		
	  for(Object str:LT)
	  {
		  System.out.println(str);
	  }
	}

}
