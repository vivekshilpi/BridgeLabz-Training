package binary_search_tree.university_record_system;

public class Student {
	 int rollNo;
	    String name;
	    Student left, right;

	    Student(int rollNo, String name) {
	        this.rollNo = rollNo;
	        this.name = name;
	        left = right = null;
	    }
}
