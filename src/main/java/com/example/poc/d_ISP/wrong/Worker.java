package com.example.poc.d_ISP.wrong;

public interface Worker {
    void signIn();
    void startWork();
    void teabreak();  // FIXME: solo trabajador humano va a tomar te, llevar a su propia interface HumanWorker
    void lunch();     // FIXME: solo trabajador humano va a comer, llevar a su propia interface HumanWorker
    void oilCheck();  // FIXME: solo trabajador robot va a poder checkear su nafta, llevar a su propia interface RobotWorker
    void batteryCharge(); // FIXME: solo trabajador robot va a poder checkear su bateria, llevar a su propia interface RobotWorker
    void continueWork();
    void signOut();
}
