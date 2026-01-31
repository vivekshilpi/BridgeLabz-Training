package com.lambdas.smarthomelighting;

public class SmartHomeLighting {

    public static void main(String[] args) {

        SmartLightController controller = new SmartLightController();

        // Register triggers dynamically
        controller.registerTrigger("motion", (brightness, color) -> System.out.println("Motion detected → Lights ON at "
                                + brightness + "% with " + color + " color"));

        controller.registerTrigger("night", (brightness, color) -> System.out.println("Night mode → Lights dimmed to "
                                + brightness + "% with " + color + " tone"));

        controller.registerTrigger("voice", (brightness, color) -> System.out.println("Voice command → Lights set to "
                                + brightness + "% and " + color));

        // Runtime execution
        controller.executeTrigger("motion", 100, "Cool White");
        controller.executeTrigger("night", 30, "Warm White");
        controller.executeTrigger("voice", 70, "Blue");
        controller.executeTrigger("party", 90, "Red"); // Not registered
    }
}
