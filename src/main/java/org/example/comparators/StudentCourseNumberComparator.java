package org.example.comparators;

import org.example.Student;

public class StudentCourseNumberComparator implements StudentComparator {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getCurrentCourseNumber(), s2.getCurrentCourseNumber());
    }
}