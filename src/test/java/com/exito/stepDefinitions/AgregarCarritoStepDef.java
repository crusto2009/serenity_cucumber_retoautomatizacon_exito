package com.exito.stepDefinitions;

import com.exito.pageObject.CarritoPage;
import com.exito.steps.CarritoPageSteps;
import com.exito.steps.HomePageSteps;
import com.exito.steps.ProductosPageSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class AgregarCarritoStepDef {

    CarritoPage carritopage;

    @Steps
    HomePageSteps homepagesteps;

    @Steps
    ProductosPageSteps productospagesteps;

    @Steps
    CarritoPageSteps carritopagesteps;

    @Dado("que ingreso en la pagina web de la tienda")
    public void queIngresoEnLaPaginaWebDeLaTienda() {
        homepagesteps.abrirNavegador();
        homepagesteps.cerrarModal();
    }
    @Cuando("de clic en el menu tipo hamburguesa y seleccione una categoria")
    public void deClicEnElMenuTipoHamburguesaYSeleccioneUnaCategoria() {
        homepagesteps.clickMenu();
        homepagesteps.clickCategoria();
    }
    @Cuando("seleccione una subcatergoria")
    public void seleccioneUnaSubcatergoria() {
        homepagesteps.clickSubCategoria();

    }
    @Cuando("de clic en del boton agregar de un producto")
    public void deClicEnDelBotonAgregarDeUnProducto() throws InterruptedException {
        productospagesteps.clicBtnAgregar();
    }
    @Cuando("de clic en el icono del carrito de compras")
    public void deClicEnElIconoDelCarritoDeCompras() {
        productospagesteps.clicBtnCarritoCompra();
    }
    @Entonces("visualizo el producto que he seleccionado para comprar")
    public void visualizoElProductoQueHeSeleccionadoParaComprar() throws InterruptedException {
        carritopagesteps.ingresarCorreoUsuario();
        carritopagesteps.validarTextoProductoSeleccionado();
    }


}
