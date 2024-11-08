package org.example;

import org.example.comparators.*;
import org.example.enums.StudentComparatorType;
import org.example.enums.UniversityComparatorType;


public class ComparatorFactory {
    private ComparatorFactory() {
    }
    public static StudentComparator getStudentComparator(StudentComparatorType type){
        switch (type){
            case FULLNAME:
                return new StudentNameComparator();
            case UNIVERSITYID:
                return new StudentUniversityIdComparator();
            case CURRENTCOURSENUMBER:
                return new StudentCourseNumberComparator();
            case AVGEXAMSCORE:
                return new StudentAvgExamScoreComparator();
            default:
                throw new IllegalArgumentException("no comparator found");
        }
    }
    public static UniversityComparator getUnivwersityComparator(UniversityComparatorType type){
        switch (type){
            case FULLNAME:
                return new UniversityFullNameComparator();
            case ID:
                return new UniversityIdComparator();
            case SHORTNAME:
                return new UniversityShortNameComparator();
            case YEAROFFOUNDATION:
                return new UniversityYeaOfFoundationComparator();
            case STUDYPROFILE:
                return new UniversityStudyProfileComparator();
            default:
                throw new IllegalArgumentException("no comparator found");
        }
    }
}
