package org.example;

public class Student {
    String fullName;
    String universityId;
    int currentCourseNumber;
    float avgExamScore;

    public Student(String universityId, String fullName, int currentCourseNumber, float avgExamScore) {
        this.avgExamScore = avgExamScore;
        this.currentCourseNumber = currentCourseNumber;
        this.fullName = fullName;
        this.universityId = universityId;
    }



    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    @Override
    public String toString() {
        return "Student : " +
                "avgExamScore = " + avgExamScore +
                ", fullName ='" + fullName + '\'' +
                ", universityId ='" + universityId + '\'' +
                ", currentCourseNumber =" + currentCourseNumber
                ;
    }
}
