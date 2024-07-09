package pages;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;


public class LoginPage extends BasePage{

    private final String labelRut = "//input[@id='web_rut2']";
    private final String labelPass = "//input[@id='web_password']";
    private final String loginBtn = "//button[@id='login']";


    public LoginPage(Page page){
        super(page);


    }

    public void sendTextRut() {
        page.waitForSelector(labelRut);
        sendKeys(labelRut,"59874721");
    }

    public void sendTextPass() {
        sendKeys(labelPass, "Prueba2022");
    }

    public void validateBtn() {
        page.waitForSelector(loginBtn);

    }

    public void clickBtnLogin() {
        clickElement(loginBtn);
    }
}
