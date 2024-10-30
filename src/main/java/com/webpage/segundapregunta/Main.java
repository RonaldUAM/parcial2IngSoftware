package com.webpage.segundapregunta;

import com.webpage.primerapregunta.CalculadoraOrden;
import com.webpage.primerapregunta.Orden;

public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion("hola","Como estas");
        Tarea tarea = new Tarea("uno","ejemplo");
        ImplGestionNotificacion implGestionNotificacion = new ImplGestionNotificacion();
        GestionNotificaciones gestionNotificaciones = new GestionNotificaciones(implGestionNotificacion);

        gestionNotificaciones.EnviarMensjaePorWhatssap(notificacion);
        gestionNotificaciones.enviarNotificacionPorMensaje(notificacion);

        ImplGestionTarea gestionTareaImpl = new ImplGestionTarea();
        GestionTarea gestionTarea = new GestionTarea(gestionTareaImpl);

        gestionTarea.insertarTarea(tarea);
        gestionTarea.leerTarea(tarea);
    }
}