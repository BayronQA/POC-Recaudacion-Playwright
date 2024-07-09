package steps;

import com.microsoft.playwright.Page;
import config.DependencyInjector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ConfirmacionModificacionEmpresa;
import pages.ModificacionEmpresaPage;

public class ConfirmacionModifiacionEmpresaSteps {

    private Page page;
    private ConfirmacionModificacionEmpresa confirmacionModificacionEmpresa;

    public ConfirmacionModifiacionEmpresaSteps(){
        this.page = DependencyInjector.getPage("firefox");
        this.confirmacionModificacionEmpresa = new ConfirmacionModificacionEmpresa(page);
    }

    @And("Presiono Confirmar")
    public void clickBtnConfirmar(){
        confirmacionModificacionEmpresa.valideBtn();
        confirmacionModificacionEmpresa.clickBtnConfirmar();
    }
}
