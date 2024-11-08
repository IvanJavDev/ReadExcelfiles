package org.example.comparators;

import org.apache.commons.lang3.StringUtils;
import org.example.University;

public class UniversityYeaOfFoundationComparator implements UniversityComparator{
    @Override
    public int compare(University u1, University u2){
        return Integer.compare(u1.getYearOfFoundation(),u2.getYearOfFoundation());
    }
}
