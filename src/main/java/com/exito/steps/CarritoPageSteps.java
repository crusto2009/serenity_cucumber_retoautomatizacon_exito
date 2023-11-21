package com.exito.steps;

import com.exito.models.NombreProducto;
import com.exito.pageObject.CarritoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.Helpers;

import java.util.concurrent.TimeUnit;

public class CarritoPageSteps {

    @Page
    CarritoPage carritopage;

    @Step
    public void ingresarCorreoUsuario(){

        //Antes
        /*carritopage.getDriver().findElement(carritopage.getTxtEmail()).sendKeys("crishernandez08@hotmail.com");
        carritopage.getDriver().findElement(carritopage.getBtnCorreoUsuario()).click();]*/

        //Nueva Implementacion
        WebDriver driver = carritopage.getDriver();
        if(Helpers.isDisplay(driver,carritopage.getTxtEmail())) {
            driver.findElement(carritopage.getTxtEmail()).sendKeys("crishernandez08@hotmail.com");
            driver.findElement(carritopage.getBtnCorreoUsuario()).click();
        }
    }

    @Step
    public void validarTextoProductoSeleccionado() throws InterruptedException {
        //Anterior
        //Thread.sleep(5000);


        //Implementacion nueva
        WebDriver driver = carritopage.getDriver();

        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
        Assert.assertEquals(
                driver.findElement(carritopage.getTxtNombreProductoSeleccionado()).getText(),
                NombreProducto.getNombreProducto());
    }


}
