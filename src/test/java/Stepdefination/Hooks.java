package Stepdefination;

import java.nio.file.Paths;
import io.cucumber.java.*;

import io.cucumber.java.Scenario;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


import Main.Base;



public class Hooks {
	public static Page page;
	public Hooks() {
		page = scenariocontext.getCurrentPage();
		
	}
	
	@BeforeAll
	public static void setup() {
		// page = Base.initBrowser("chromium");
		// return page;
		System.out.println("String the execution");
	}
	
	@After
	public void close(Scenario scenario) {	
		
		   System.out.println("screen shot attached");
		//  page.screenshot(new ScreenshotOptions().setPath(Paths.get("./ScreenShot/img.png")));
		   byte[] screenshot = page.screenshot();

           // Attach the screenshot to the Cucumber HTML report
           scenario.attach(screenshot, "image/png", "Failed_Screenshot");
		//Base.quit();	
	}
	
	@AfterAll
	public void close() {
		 Base.quit();
	}

}
