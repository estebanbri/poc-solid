package com.example.poc.a_SRP.wrong;

public class BankService {

    public long deposit() {
        return 0;
    }

    public long withDraw() {
        return 0;
    }

    // FIXME: llevar a servicio que se encargue solo de imprimir
    public void printPassbook() {
        // update transaction info in passbook
    }

    // FIXME: llevar a servicio que se encargue solo de los loan
    public void getLoanInteresInfo(String loanType) {
        // logic related to loan
    }

    // FIXME: llevar a servicio que se encargue solo de notificaciones
    public void sendOTP(String medium) {
        // logic related to sending notification
    }

}
