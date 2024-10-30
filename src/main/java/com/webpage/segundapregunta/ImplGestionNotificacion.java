package com.webpage.segundapregunta;

public class ImplGestionNotificacion implements IgestionNotificacion{

    @Override
    public void enviarMSM(Notificacion notificacion) {
        System.out.println("Enviando Notificacion por msm");
    }

    @Override
    public void enviarWhatsaap(Notificacion notificacion) {
        System.out.println("Enviando Notificacion por Whatssap");
    }
}
