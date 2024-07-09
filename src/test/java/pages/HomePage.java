package pages;

import com.microsoft.playwright.Page;

public class HomePage extends BasePage {

    private String loginBtn = "//a[normalize-space()='Ingresar Aquí']";

    public HomePage(Page page){
        super(page);
    }
    public void navigateToPrevired() {
        page.navigate("https://qa1.previred.com/");
    }

    public void clickOnIngresarAqui() {
        clickElement(loginBtn);
    }
}