package pages;

import com.microsoft.playwright.Page;

public class PagoCotizacionesPage extends BasePage {

    private String btningresarROLTE = "//li[@id='empresa']";

    public PagoCotizacionesPage(Page page){
        super(page);
    }
    public void joinToRolTE(){
        clickElement(btningresarROLTE);
    }

}
