package ambulance_route;

public class ConnectingUnits {
	
	private Unit head;
	
	//Add new unit 
	public void addUnit(String name, boolean isAvailable) {
		Unit newUnit = new Unit(name, isAvailable);
		if(head == null) {
		     head = newUnit;
		     newUnit.next = head;
			return;
		}
		
		Unit temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		
		temp.next = newUnit;
		newUnit.next = head;
		
	}
	
	//Find nearest available unit
	public void findAvailable() {
		if(head == null) {
			System.out.println("No available unit");
		}
		Unit temp = head;
		do {
			if(temp.isAvailable) {
				System.out.println("Patient Admitted in " + temp.name);
				temp.isAvailable = false;
				return;
			}
			temp = temp.next;
		}while(temp.next!=head);
		System.out.println("No available unit");
	}
	
	//Remove a unit if it's under maintenance.
	public void removeUnit(String name) {
		if(head == null) {
			System.out.println("No available unit");
		}
		
		Unit curr = head;
		Unit prev = head;
		   do {
	            if (curr.name.equalsIgnoreCase(name)) {

	                // Single node case
	                if (curr == head && curr.next == head) {
	                    head = null;
	                    return;
	                }

	                // Removing head
	                if (curr == head) {
	                    Unit last = head;
	                    while (last.next != head) {
	                        last = last.next;
	                    }
	                    head = head.next;
	                    last.next = head;
	                } else {
	                    prev.next = curr.next;
	                }
	                return;
	            }
	            prev = curr;
	            curr = curr.next;
	        } while (curr != head);
	    }

	    // Display circular route
	    public void displayRoute() {
	        if (head == null) {
	            System.out.println("No hospital units available.");
	            return;
	        }

	        Unit temp = head;
	        do {
	            System.out.print(temp.name + " → ");
	            temp = temp.next;
	        } while (temp != head);

	        System.out.println("(back to " + head.name + ")");
	    }
	}