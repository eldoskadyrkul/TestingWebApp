package com.task.testing.models;

public class Subjects {

    private int ID_Subjects;
    private String name_subjects;

    public Subjects(int ID_Subjects, String name_subjects) {
        this.ID_Subjects = ID_Subjects;
        this.name_subjects = name_subjects;
    }

    public int getID_Subjects() {
        return ID_Subjects;
    }

    public void setID_Subjects(int ID_Subjects) {
        this.ID_Subjects = ID_Subjects;
    }

    public String getName_subjects() {
        return name_subjects;
    }

    public void setName_subjects(String name_subjects) {
        this.name_subjects = name_subjects;
    }
}
