package Main;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Base {
	
	public static Playwright play;
	public static Browser browser;
	public static BrowserContext browsercontext;
	public static Page I;
	
	public static Page initBrowser(String browserName)
	{
		 play = Playwright.create();
		switch(browserName)
		{
		case "chromium":
			browser = play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "firefox":
			browser = play.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		case "chrome":
			browser = play.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
			break;
		default:
			break;
		}
		
		browsercontext = browser.newContext();
		I= browsercontext.newPage();
		
	
  return I;
}
	public static void quit() {
		I.close();	
	}
}
