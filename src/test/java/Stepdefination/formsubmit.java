package Stepdefination;

import java.nio.channels.AcceptPendingException;
import java.nio.file.Paths;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.ElementHandle.ScreenshotOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.SelectOptionOptions;
import com.microsoft.playwright.options.SelectOption;

import Main.Base;
import io.cucumber.java.en.*;


public class formsubmit {
	static Page page;  
	
	public formsubmit() {
		//page =Base.initBrowser("chromium");
		
		page = scenariocontext.getCurrentPage();
		//scenariocontext.setCurrentPage(page);
	}
	

	
	
	@Given("User in home page")
	public void user_in_home_page() {
	
		page.navigate("https://qavbox.github.io/demo/");
		assertThat(page).hasTitle("QAVBOX Demo");

	
	   
	}

	@When("User click on {string}")
	public void user_click_on(String arg1) {
	 page.click("//a[text()='"+arg1+"']");
	   
	}

	@Then("User navigate to Registration Page")
	public void user_navigate_to_registration_page() {
		assertThat(page).hasURL("https://qavbox.github.io/demo/signup/");
	    
	}

	@Then("User fill the details and submit the form")
	public void user_fill_the_details_and_submit_the_form() {
		page.fill("#username", "Anilkumar");
		page.fill("#email", "anil@1986@gmail.com");
		page.fill("#tel", "9995044907");
		page.setInputFiles("//input[@name='datafile']" ,Paths.get("D:\\new.json"));
	//	page.locator("//select[@name='sgender']").click();
	//	page.waitForSelector("//option[@value='male']");
		 Locator dropdown = page.locator("//select[@name='sgender']");
		 dropdown.selectOption("male");
		page.click("//input[@value='automationtesting']");
		page.locator("//*[@value='jmeter']").click();
		Locator text =page.locator("label:has-text('Years of Experience:')");
	
			//	page.locator("//label[@for='experience'][text()='Years of Experience:']").innerText();
		System.out.println("text :"+	text.innerText());
		String text1 =page.getByText("Years of Experience:").innerText();
		//byte[] buffer = page.locator("label:has-text('Years of Experience:')").screenshot(new Page. ScreenshotOptions() setPath(Paths. get("screenshot.png")));
		page.locator("label:has-text('Years of Experience:')").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("ScreenShot/screenshot.png")));
		page.click("#submit"); 

	}
	
	@Given("User navigate to home page")
	public void user_navigate_to_home_page() {
		//scenariocontext.getCurrentPage();
		
		page.click("//input[@value='Home']");
	  
	}

	@Then("User Drag and drop the element")
	public void user_drag_and_drop_the_element() {
		page.dragAndDrop("//div[@id='draggable']", "//div[@id='droppable']");
		page.navigate("https://demoblaze.com/");
		page.waitForLoadState();
	
	}


}
