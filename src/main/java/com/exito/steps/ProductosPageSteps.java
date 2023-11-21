package com.exito.steps;

import com.exito.models.NombreProducto;
import com.exito.pageObject.ProductosPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import utils.Helpers;

import java.util.concurrent.TimeUnit;


public class ProductosPageSteps {

    @Page
    ProductosPage productospage;

    @Step
    public void clicBtnAgregar() throws InterruptedException {
        //Antes
        //Thread.sleep(6000);

        //Nueva Implementacion
        WebDriver driver = productospage.getDriver();

        driver.manage().timeouts().implicitlyWait(80L, TimeUnit.SECONDS);
        productospage.moveTo(productospage.getBtnAgregarProducto());

        if(Helpers.isDisplay(driver,productospage.getBtnAgregarProducto())) {
            //Capturamos el nombre del producto seleccionado
            NombreProducto.setNombreProducto(driver.findElement(productospage.getTxtNombreProducto()).getText());
            driver.findElement(productospage.getBtnAgregarProducto()).click();
        }

    }

    @Step
    public void clicBtnCarritoCompra(){
        productospage.getDriver().findElement(productospage.getBtnMiniCarritoCompra()).click();
    }
}
