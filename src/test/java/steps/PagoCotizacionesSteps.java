package steps;

import com.microsoft.playwright.Page;
import config.DependencyInjector;
import io.cucumber.java.en.Then;
import pages.PagoCotizacionesPage;

public class PagoCotizacionesSteps {

    private Page page;
    private PagoCotizacionesPage pagoCotizacionesPage;

    public PagoCotizacionesSteps(){
        this.page = DependencyInjector.getPage("firefox");
        this.pagoCotizacionesPage = new PagoCotizacionesPage(page);
    }
    @Then("Debería acceder correctamente con el ROL de TE")
    public void clickOnRolTE(){
        pagoCotizacionesPage.joinToRolTE();
    }

}
