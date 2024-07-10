package steps;

import com.microsoft.playwright.Page;
import config.DependencyInjector;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import pages.ConfirmacionModificacionEmpresa;
import pages.ModificacionEmpresaPage;
import utils.ScreenshotUtil;

public class ConfirmacionModifiacionEmpresaSteps {

    private Page page;
    private ConfirmacionModificacionEmpresa confirmacionModificacionEmpresa;
    private ModificacionEmpresaPage modificacionEmpresaPage;

    public ConfirmacionModifiacionEmpresaSteps(){
        this.page = DependencyInjector.getPage("firefox");
        this.confirmacionModificacionEmpresa = new ConfirmacionModificacionEmpresa(page);
        this.modificacionEmpresaPage = new ModificacionEmpresaPage(page);
    }
    @Then("Valido si cambió la direccion {}")
    public void validateChange(String calle) throws InterruptedException{
       Assert.assertEquals(modificacionEmpresaPage.getValorEnviado(calle), confirmacionModificacionEmpresa.getTextConfirmCalle());
    }
    @And("Presiono Confirmar")
    public void clickBtnConfirmar(){
        confirmacionModificacionEmpresa.valideBtn();
        confirmacionModificacionEmpresa.clickBtnConfirmar();
    }

    @After
    public void tearDown(Scenario scenario) {
        ScreenshotUtil.takeScreenshotOnFailure(page, scenario);
    }
}
