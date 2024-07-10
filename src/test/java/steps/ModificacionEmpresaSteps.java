package steps;

import com.microsoft.playwright.Page;
import config.DependencyInjector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ConfirmacionModificacionEmpresa;
import pages.ModificacionEmpresaPage;

public class ModificacionEmpresaSteps {

    private Page page;
    private ModificacionEmpresaPage modificacionEmpresaPage;
    private ConfirmacionModificacionEmpresa confirmacionModificacionEmpresa;

    public ModificacionEmpresaSteps(){
        this.page = DependencyInjector.getPage("firefox");
        this.modificacionEmpresaPage = new ModificacionEmpresaPage(page);
        this.confirmacionModificacionEmpresa = new ConfirmacionModificacionEmpresa(page);
    }

    @And("Actualizo la direccion {} de la empresa")
    public void updateData(String calle) throws InterruptedException{
        modificacionEmpresaPage.changeData(calle);
    }
    @And("Presiono Siguiente paso")
    public void clickBtnSiguientePaso(){
        modificacionEmpresaPage.clickSiguientePaso();
    }

}
