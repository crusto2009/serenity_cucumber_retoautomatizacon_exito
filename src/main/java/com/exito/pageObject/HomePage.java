package com.exito.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By btnCerrarModalInfo = By.xpath("//*[@id='wps-overlay-close-button']");

    private By btnMenu = By.xpath("//*[@id='category-menu']");

    private By linkCaterogia = By.xpath("//li[contains(@id,'Celulares y accesorios')]");

    private By linkSubCaterogia = By.xpath("//*[text()='Apple']");

    public By getBtnCerrarModalInfo() {
        return btnCerrarModalInfo;
    }

    public By getBtnMenu() {
        return btnMenu;
    }

    public By getLinkCaterogia() {
        return linkCaterogia;
    }

    public By getLinkSubCaterogia() {
        return linkSubCaterogia;
    }
}
