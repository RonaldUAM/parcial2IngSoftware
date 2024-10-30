package com.webpage.segundapregunta;

public class ImplGestionTarea implements IgestionTarea{
    @Override
    public void insertarTarea(Tarea tarea) {
        System.out.println("Insertando tarea \n"+tarea.toString());
    }

    @Override
    public void leerTarea(Tarea tarea) {
        System.out.println("Obteniendo tarea \n"+tarea.toString());
    }
}
