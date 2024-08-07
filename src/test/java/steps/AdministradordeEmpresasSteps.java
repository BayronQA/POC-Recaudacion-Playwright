package steps;

import com.microsoft.playwright.Page;
import config.DependencyInjector;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.After;
import pages.AdministradordeEmpresasPage;
import utils.ScreenshotUtil;

public class AdministradordeEmpresasSteps {

    private Page page;
    private AdministradordeEmpresasPage administradordeEmpresasPage;

    public AdministradordeEmpresasSteps(){
        this.page = DependencyInjector.getPage("firefox");
        this.administradordeEmpresasPage = new AdministradordeEmpresasPage(page);
    }
    @Given("Estoy en el menú de actualización de datos")
    public void validateTitle(){
        administradordeEmpresasPage.validatePage();
    }
    @When("Selecciono Modificación datos Empresa")
    public void clickModifyDataEmpresa(){
        administradordeEmpresasPage.clickModifyBtn();
    }

    @After
    public void tearDown(Scenario scenario) {
        ScreenshotUtil.takeScreenshotOnFailure(page, scenario);
    }

}
