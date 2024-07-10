package steps;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import config.DependencyInjector;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.ScreenshotUtil;

import java.nio.file.Paths;

public class Steps {
    private Page page;
    private HomePage homePage;

    public Steps(){
        this.page = DependencyInjector.getPage("firefox");
        this.homePage = new HomePage(page);
    }
    @Given("Abro el navegador y navego a la página de inicio")
    public void iNavigateToPrevired(){

        homePage.navigateToPrevired();
    }

    @When("Hago clic en Ingresar aquí")
    public void clickbtnlogin(){
        homePage.clickOnIngresarAqui();


    }

    @After
    public void tearDown(Scenario scenario) {
        ScreenshotUtil.takeScreenshotOnFailure(page, scenario);
    }


}
