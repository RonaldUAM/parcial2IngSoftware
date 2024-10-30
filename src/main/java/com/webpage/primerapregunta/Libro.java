package com.webpage.primerapregunta;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private LocalDate age;

    public Libro(String titulo, String autor, double precio, LocalDate age) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.age = age;
    }
}
