package com.example.poc.b_OCP.wrong;

public class NotificationService {

    // FIXME: Paso 1. Crear una interfaz que declare dicho metodo
    public void sendOTP(String medium) {
        if (medium.equals("email") ) {  // FIXME: Paso 2. Crear una clase especializada que contendra la logica de envio de notificacion OTP via email
            // logic regarding email notification
        }
        if (medium.equals("mobile") ) { // FIXME: Paso 3. Crear una clase especializada que contendra la logica de envio de notificacion OTP via mobile
            // logic regarding mobile notification
        }
    }

    // TODO crear endpoints diferentes para notificacion y que ejecuten la implementacion requerida es decir,
    // TODO      /notification-email   -> emailNotificationService.sendOTP()
    // TODO      /notification-mobile  -> mobileNotificationService.sendOTP()

}
