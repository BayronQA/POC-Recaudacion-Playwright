package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class ConfirmacionModificacionEmpresa extends BasePage{

    public String ConfirmCalle = "//div[@id='conf_dir_calle']";
    private String btnConfirmar = "//span[@id='span_boton_aceptar']";

    public ConfirmacionModificacionEmpresa(Page page){
        super(page);

    }

    public void valideBtn(){
        elementIsDisplayed(btnConfirmar);
    }
    public void clickBtnConfirmar(){
        clickElement(btnConfirmar);
    }
    public String getTextConfirmCalle(){
        return textFromElement(ConfirmCalle);

    }

}
