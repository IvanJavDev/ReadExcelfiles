package org.example;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.enums.StudyProfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;




public class ReadStudentsUniversity  {
    private static ReadStudentsUniversity instance;
    private ReadStudentsUniversity() {
    }
    public static ReadStudentsUniversity getInstance() {
        if (instance == null) {
            instance = new ReadStudentsUniversity();
        }
        return instance;
    }

    public static List<Student> ReadStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\hezha\\IdeaProjects\\UniversitySystem-main\\src\\main\\resources\\universityInfo.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Студенты");


        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue; // Пропускаем заголовок
            String universityId = row.getCell(0).getStringCellValue();
            String fullName = row.getCell(1).getStringCellValue();
            int currentCourseNumber = (int) row.getCell(2).getNumericCellValue();
            float avgExamScore = (float) row.getCell(3).getNumericCellValue();
            students.add(new Student(universityId, fullName, currentCourseNumber, avgExamScore));

        }
        return students;
    }


    public static List<University> ReadUniversity() throws IOException {
        List<University> universities = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\hezha\\IdeaProjects\\UniversitySystem-main\\src\\main\\resources\\universityInfo.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Университеты");

        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue; // Пропускаем заголовок
            String id = row.getCell(0).getStringCellValue();
            String fullName = row.getCell(1).getStringCellValue();
            String shortName = row.getCell(2).getStringCellValue();
            int yearOfFoundation = (int) row.getCell(3).getNumericCellValue();
            String profileString = row.getCell(4).getStringCellValue();
            StudyProfile studyProfile = StudyProfile.fromString(profileString);
            universities.add(new University( id,  fullName,  shortName,  yearOfFoundation,  studyProfile));

        }
        return universities;
    }

}

