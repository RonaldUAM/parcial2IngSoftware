package com.webpage.primerapregunta;

public class Orden {
    private double precio;
    private double descuento;
    private double impuesto;

    public Orden(double precio, double descuento, double impuesto) {
        this.precio = precio;
        this.descuento = descuento;
        this.impuesto = impuesto;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
}
