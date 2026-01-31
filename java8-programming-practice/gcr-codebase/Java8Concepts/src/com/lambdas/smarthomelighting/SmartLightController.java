package com.lambdas.smarthomelighting;
import java.util.HashMap;
import java.util.Map;

class SmartLightController {

    private Map<String, LightAction> triggerActions = new HashMap<>();

    // Register trigger dynamically
    public void registerTrigger(String trigger, LightAction action) {
        triggerActions.put(trigger.toLowerCase(), action);
    }

    // Execute trigger dynamically
    public void executeTrigger(String trigger, int brightness, String color) {
        LightAction action = triggerActions.get(trigger.toLowerCase());

        if (action != null) {
            action.activate(brightness, color);
        } else {
            System.out.println("No action configured for trigger: " + trigger);
        }
    }
}
