package Stepdefination;

import com.microsoft.playwright.Page;


public class scenariocontext {

    private static Page currentPage;

    public static Page getCurrentPage() {
    	//Hooks.setup();
        return currentPage;
    }

    public static void setCurrentPage(Page page) {
        currentPage = page;
    }
}