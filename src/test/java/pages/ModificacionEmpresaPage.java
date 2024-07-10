package pages;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

public class ModificacionEmpresaPage extends BasePage{

    private String labelCalle = "//p[normalize-space()='Calle']";
    private String inputCalle = "//input[@id='web_dir_calle']";
    private String btnSiguientePaso = "//button[@id='boton_aceptar']";
    private String valorEnviado;
    public String valorprueba = "Calle numero 33";

    public ModificacionEmpresaPage(Page page){
        super(page);


    }

    public void changeData (String calle) throws InterruptedException{
        sendKeys(inputCalle, calle);
        valorEnviado = calle;
        System.out.println("Valor enviado: " + valorEnviado);
        Thread.sleep(3000);
    }

    public String getValorEnviado(String calle)throws InterruptedException{
        Thread.sleep(3000);
        valorEnviado = calle;
        return valorEnviado;


    }

    public String getValorprueba(){

        return valorprueba;

    }

    public void clickSiguientePaso(){
        clickElement(btnSiguientePaso);
    }
}
