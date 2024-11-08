package org.example.enums;

public enum StudyProfile {

    MEDICINE("Медицина"),
    PHYSICS("Физика"),
    LINGUISTICS("Лингвистика"),
    MATHEMATICS("Математика");

    private String profileName;

    public static StudyProfile fromString(String text) {
        switch (text.toUpperCase()) {
            case "PHYSICS":
                return PHYSICS;
            case "MEDICINE":
                return MEDICINE;
            case "LINGUISTICS":
                return LINGUISTICS;
            case "MATHEMATICS":
                return MATHEMATICS;
            default:
                throw new IllegalArgumentException("Unknown study profile: " + text);
        }
    }

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }
}


