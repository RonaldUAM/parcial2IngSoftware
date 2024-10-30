package com.webpage.segundapregunta;

public class Notificacion {
    private String head;
    private String body;

    public Notificacion(String head, String body) {
        this.head = head;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Notificacion{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
