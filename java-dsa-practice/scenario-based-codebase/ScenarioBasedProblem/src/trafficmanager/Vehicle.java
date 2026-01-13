package trafficmanager;

public class Vehicle {

    public String number;
    public Vehicle next;

    public Vehicle(String number) {
        this.number = number;
        this.next = null;
    }
}
