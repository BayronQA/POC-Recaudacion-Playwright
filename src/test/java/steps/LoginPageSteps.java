package steps;

import com.microsoft.playwright.Page;
import config.DependencyInjector;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import org.junit.After;
import pages.LoginPage;
import utils.ScreenshotUtil;

public class LoginPageSteps {
    private Page page;
    private LoginPage loginPage;
    public LoginPageSteps(){
        this.page = DependencyInjector.getPage("firefox");
        this.loginPage = new LoginPage(page);
    }
    @And("Ingreso el nombre de usuario valido y la contraseña valida")
    public void sendRutAndPass(){

        loginPage.sendTextRut();
        loginPage.sendTextPass();
    }
    @And("Presiono el botón Ingresar")
    public void clickBtnLoginPage() throws InterruptedException {
        loginPage.validateBtn();
        loginPage.clickBtnLogin();
    }
    @After
    public void tearDown(Scenario scenario) {
        ScreenshotUtil.takeScreenshotOnFailure(page, scenario);
    }
}
