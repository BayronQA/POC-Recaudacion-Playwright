package pages;

import com.microsoft.playwright.Page;

public class ModificacionEmpresaPage extends BasePage{

    private String labelCalle = "//p[normalize-space()='Calle']";
    private String inputCalle = "//input[@id='web_dir_calle']";
    private String btnSiguientePaso = "//button[@id='boton_aceptar']";
    public String valorEnviado;
    public String valorprueba = "hola";

    public ModificacionEmpresaPage(Page page){
        super(page);


    }

    public void changeData (String calle) throws InterruptedException{
        sendKeys(inputCalle, calle);
        valorEnviado = calle;
        Thread.sleep(3000);
    }

    public String getValorEnviado(){
        return valorEnviado;


    }

    public String getValorprueba(){
        return valorprueba;
    }

    public void clickSiguientePaso(){
        clickElement(btnSiguientePaso);
    }
}
