package com.task.testing.models;

public class Questions {

    private int id;
    private String textQuestions;
    private int subjectsID;

    public Questions (int id, String textQuestions, int subjectsID) {
        this.id = id;
        this.textQuestions = textQuestions;
        this.subjectsID = subjectsID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextQuestions() {
        return textQuestions;
    }

    public void setTextQuestions(String textQuestions) {
        this.textQuestions = textQuestions;
    }

    public int getSubjectsID() {
        return subjectsID;
    }

    public void setSubjectsID(int subjectsID) {
        this.subjectsID = subjectsID;
    }
}
