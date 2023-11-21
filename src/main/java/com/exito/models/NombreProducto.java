package com.exito.models;

public class NombreProducto {

    private static String nombreProducto;


    public static String getNombreProducto() {
        return nombreProducto;
    }

    public static void setNombreProducto(String nombreProducto) {
        NombreProducto.nombreProducto = nombreProducto;
    }
}
