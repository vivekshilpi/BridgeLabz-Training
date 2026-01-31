package com.lambdas.hospitalemergency;

import java.util.List;

public class HospitalApp {

    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("Heart rate critical", "EMERGENCY"),
                new Alert("Take blood pressure medicine", "MEDICATION"),
                new Alert("Appointment reminder", "GENERAL")
        );

        // Stream + Predicate (Lambda)
        alerts.stream()
              .filter(alert -> alert.type.equals("EMERGENCY"))
              .forEach(System.out::println);
    }
}