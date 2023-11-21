package com.exito.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {

    private By txtEmail = By.xpath("//input[@name='email']");

    private By btnCorreoUsuario = By.xpath("//button[text()='Confirmar']");

    private By txtNombreProductoSeleccionado = By.xpath("//*[@data-molecule-product-detail-name-span='true']");

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getBtnCorreoUsuario() {
        return btnCorreoUsuario;
    }

    public By getTxtNombreProductoSeleccionado() {
        return txtNombreProductoSeleccionado;
    }
}
