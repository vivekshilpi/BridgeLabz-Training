package com.lambdas.hospitalemergency;
class Alert {
    String message;
    String type;   // EMERGENCY, MEDICATION, GENERAL

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " Alert: " + message;
    }
}