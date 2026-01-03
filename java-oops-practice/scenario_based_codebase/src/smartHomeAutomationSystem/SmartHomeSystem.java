package smartHomeAutomationSystem;

public class SmartHomeSystem {
    public static void main(String[] args) {

        Appliance light = new Light(40);
        Appliance fan = new Fan(75);
        Appliance ac = new AC(1500);

        UserController controller = new UserController();

        controller.controlDevice(light, true);
        controller.controlDevice(ac, true);
        controller.controlDevice(fan, false);

        controller.compareUsage(light, ac);
    }
}

