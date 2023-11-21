package com.exito.steps;

import com.exito.pageObject.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import utils.Helpers;

public class HomePageSteps {

    @Page
    HomePage pagehome;

    @Step
    public void abrirNavegador(){
        pagehome.openUrl("https://www.exito.com/");
    }

    @Step
    public void cerrarModal(){
        //Antes
        //pagehome.getDriver().findElement(pagehome.getBtnCerrarModalInfo()).click();

        //Nueva Implementacion
        WebDriver driver = pagehome.getDriver();
        if(Helpers.isDisplay(driver,pagehome.getBtnCerrarModalInfo())) {
            driver.findElement(pagehome.getBtnCerrarModalInfo()).click();
        }

    }

    @Step
    public void clickMenu(){
        pagehome.getDriver().findElement(pagehome.getBtnMenu()).click();
    }

    @Step
    public void clickCategoria(){
        pagehome.getDriver().findElement(pagehome.getLinkCaterogia()).click();
    }

    @Step
    public void clickSubCategoria(){
        pagehome.getDriver().findElement(pagehome.getLinkSubCaterogia()).click();
    }



}
