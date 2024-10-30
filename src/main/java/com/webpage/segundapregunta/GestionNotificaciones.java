package com.webpage.segundapregunta;

public class GestionNotificaciones {
    private IgestionNotificacion igestionNotificacion;

    public GestionNotificaciones(IgestionNotificacion notificacion) {
        this.igestionNotificacion = notificacion;
    }

    public void enviarNotificacionPorMensaje(Notificacion notificacion){
        this.igestionNotificacion.enviarMSM(notificacion);
    }
    public void EnviarMensjaePorWhatssap(Notificacion notificacion){
        this.igestionNotificacion.enviarWhatsaap(notificacion);
    }
}
