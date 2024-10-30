package com.webpage.segundapregunta;

public class GestionTarea {
    private IgestionTarea igestionTarea;

    public GestionTarea(IgestionTarea igestionTarea) {
        this.igestionTarea = igestionTarea;
    }

    public void insertarTarea(Tarea tarea){
        igestionTarea.insertarTarea(tarea);
    }
    public void leerTarea(Tarea tarea){
        igestionTarea.leerTarea(tarea);
    }
}
