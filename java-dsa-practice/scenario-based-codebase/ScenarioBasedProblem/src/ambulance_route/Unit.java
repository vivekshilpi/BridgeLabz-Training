package ambulance_route;

public class Unit {
	String name;
	boolean isAvailable;
	Unit next;
	
	Unit(String name, boolean isAvailable){
		this.name = name;
		this.isAvailable = isAvailable;
		this.next = null;
	}
	
}
