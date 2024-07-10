package utils;

import com.microsoft.playwright.Page;
import io.cucumber.java.Scenario;

public class ScreenshotUtil {
    public static void takeScreenshotOnFailure(Page page, Scenario scenario){
        if (scenario.isFailed()){
            scenario.log("El escenario falló, por favor revisa la imagen adjunta al reporte");
            byte[] screenshot = page.screenshot();
            scenario.attach(screenshot, "image/png", "Screenshot del error: ");
        }
    }
}
