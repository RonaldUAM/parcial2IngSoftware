package com.webpage.primerapregunta;

public class Main {
    public static void main(String[] args) {
        //Aplicacion del DRY
        Orden orden = new Orden(100000,40000,0.1);
        CalculadoraOrden calculadoraOrden = new CalculadoraOrden();
        System.out.println(calculadoraOrden.calcularDescuentoTotal(orden));
        System.out.println(calculadoraOrden.calcularTotalImpuesto(orden));

        //Aplicacion del KISS
    }
}