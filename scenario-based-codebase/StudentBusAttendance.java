/*
School Bus Attendance System 
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/
import java.util.*;

public class StudentBusAttendance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // List of 10 students
        String[] students = {
            "Amit", "Priya", "Rahul", "Sneha", "Vikas",
            "Neha", "Arjun", "Kiran", "Pooja", "Rohan"
        };

        int presentCount = 0;
        int absentCount = 0;

        // For-each loop to track attendance
        for (String name : students) {
            System.out.print(name + " - Present or Absent? (P/A): ");
            char status = sc.next().toUpperCase().charAt(0);

            if (status == 'P') {
                presentCount++;
            } else if (status == 'A') {
                absentCount++;
            } else {
                System.out.println("Invalid input! Marking as Absent.");
                absentCount++;
            }
        }

        // Attendance summary
        System.out.println("\n Attendance Summary ");
        System.out.println("Total Students : " + students.length);
        System.out.println("Present        : " + presentCount);
        System.out.println("Absent         : " + absentCount);
    }
}