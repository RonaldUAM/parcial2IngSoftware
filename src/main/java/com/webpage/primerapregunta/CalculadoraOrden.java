package com.webpage.primerapregunta;

public class CalculadoraOrden {

    public double calcularTotalImpuesto(Orden orden){
        double impuesto = orden.getImpuesto()*orden.getPrecio();
        return orden.getPrecio() + impuesto;
    }

    public double calcularDescuentoTotal(Orden orden){
        double descuentoPrecio = orden.getPrecio() - orden.getDescuento();
        double impuesto = descuentoPrecio * orden.getImpuesto();
        return descuentoPrecio+impuesto;
    }
}
