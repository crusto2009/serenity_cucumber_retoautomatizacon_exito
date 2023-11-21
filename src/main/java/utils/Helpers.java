package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.exceptions.NoSuchElementException;

public class Helpers {

    private static Boolean isVisible;

    public static Boolean isDisplay(WebDriver driver,By elemento){
        try
        {
            isVisible =driver.findElement(elemento).isDisplayed();
        }
        catch(NoSuchElementException ex)
        {
            System.out.println("Elemento no encontrado.." + ex);
        }

        return isVisible;
    }
}
