package pages;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected Page page;

    public BasePage(Page page){
        this.page = page;
    }

    public void navigateTo(String url) {
        navigateTo("https://qa1.previred.com/");
    }

    // Cerrar la instancia de automatización
  /*  public static void closeBrowser() {
        page.close();
    }*/

    // Espera global para todos los elementos
    private void find(String selector) {
        page.waitForSelector(selector);
    }

    // Método para realizar clic en un elemento
    public void clickElement(String selector) {
        find(selector);
        page.click(selector);
    }

    // Método para escribir dentro de un input
    public void sendKeys(String selector, String text) {
        find(selector);
        page.fill(selector, text);
    }

    // Obtener texto de un elemento
    public String textFromElement(String selector) {
        find(selector);
        return page.textContent(selector);
    }

    // Verificar si un elemento está visible
    public boolean elementIsDisplayed(String selector) {
        return page.isVisible(selector);
    }


}