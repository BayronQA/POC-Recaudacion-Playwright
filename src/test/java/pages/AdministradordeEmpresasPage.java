package pages;

import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AdministradordeEmpresasPage extends BasePage {

    private String btnmodifyData = "//button[@id='modifica@76486253@00']";
    private String titleh2 = "//h2[normalize-space()='Administrador de Empresas']";
    private String btnAgregarEmpresa = "//button[@class='btn continua']";

    public AdministradordeEmpresasPage(Page page){
        super(page);
    }

    public void clickModifyBtn(){
        clickElement(btnmodifyData);
    }

    public void validatePage(){
        assertThat(page.locator(btnAgregarEmpresa)).isEnabled();
    }
}
