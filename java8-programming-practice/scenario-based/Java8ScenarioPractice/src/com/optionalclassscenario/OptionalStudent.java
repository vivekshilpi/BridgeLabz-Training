package com.optionalclassscenario;
import java.util.*;

public class OptionalStudent {

    static class Student {
        String name;
        String email;
        String phone;
        String address;
        String nickname;

        public Student(String name, String email, String phone, String address, String nickname) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.address = address;
            this.nickname = nickname;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rashi", null, null, null, null);
        Student s2 = new Student("Sahil", "sahil@email.com", "9876543210", "Mumbai", "Sai");

        // 1. Safely fetch email
        System.out.println("----- Fetch Email -----");
        System.out.println(Optional.ofNullable(s1.email).orElse("Email not available"));
        System.out.println(Optional.ofNullable(s2.email).orElse("Email not available"));

        // 2. Return default phone number
        System.out.println("\n----- Phone Number -----");
        System.out.println(Optional.ofNullable(s1.phone).orElse("0000000000"));
        System.out.println(Optional.ofNullable(s2.phone).orElse("0000000000"));

        // 3. Find student by ID (simulate with null)
        System.out.println("\n----- Find Student by ID -----");
        Student studentById = null; // simulate not found
        System.out.println(Optional.ofNullable(studentById).map(st -> st.name).orElse("Student not available"));

        // 4. Fetch address safely
        System.out.println("\n----- Fetch Address -----");
        System.out.println(Optional.ofNullable(s1.address).orElse("Address not available"));
        System.out.println(Optional.ofNullable(s2.address).orElse("Address not available"));

        // 5. Return nickname if present, otherwise real name
        System.out.println("\n----- Nickname or Real Name -----");
        System.out.println(Optional.ofNullable(s1.nickname).orElse(s1.name));
        System.out.println(Optional.ofNullable(s2.nickname).orElse(s2.name));
    }
}
