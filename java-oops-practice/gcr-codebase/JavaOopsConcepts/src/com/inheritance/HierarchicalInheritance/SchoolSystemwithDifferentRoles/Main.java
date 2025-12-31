package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

public class Main {
    public static void main(String[] args) {

        // Create object of Teacher class
        Teacher mathTeacher = new Teacher("Om Tiwari", 35, "Mathematics");
        // Call method from Teacher class
        mathTeacher.displayTeacherInfo();

        // Create object of Student class
        Student studentAlex = new Student("HarshVeer Thakur", 16, 11);
        // Call method from Student class
        studentAlex.displayStudentInfo();
    }
}
