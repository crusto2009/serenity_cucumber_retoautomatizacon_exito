package com.exito.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductosPage extends PageObject {

    private By btnAgregarProducto = By.xpath("(((//*[@id='gallery-layout-container']//section)[3]//article)/div[2]/div[2])//button");

    private By txtNombreProducto = By.xpath("(((//*[@id='gallery-layout-container']//section)[3]//article)/div[2]/div[2])//h3");

    private By btnMiniCarritoCompra = By.xpath("//a[contains(@class,'minicartLink')]");

    public By getBtnAgregarProducto() {
        return btnAgregarProducto;
    }

    public By getTxtNombreProducto() {
        return txtNombreProducto;
    }

    public By getBtnMiniCarritoCompra() {
        return btnMiniCarritoCompra;
    }
}
