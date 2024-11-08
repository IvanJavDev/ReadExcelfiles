package org.example.comparators;

import org.apache.commons.lang3.StringUtils;
import org.example.Student;

public class StudentNameComparator implements StudentComparator {
    @Override
    public int compare(Student s1, Student s2) {
        return StringUtils.compare(s1.getFullName(), s2.getFullName());
    }
}



