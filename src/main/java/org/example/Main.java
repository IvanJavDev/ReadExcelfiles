package org.example;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
ReadStudentsUniversity readStudentsUniversity = ReadStudentsUniversity.getInstance();
        try {
            List<Student> students = ReadStudentsUniversity.ReadStudents();
            List<University> universities = ReadStudentsUniversity.ReadUniversity();


            System.out.println("Students:");
            for (Student student : students) {
                System.out.println(student);
            }


            System.out.println("\nUniversities:");
            for (University university : universities) {
                System.out.println(university);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}