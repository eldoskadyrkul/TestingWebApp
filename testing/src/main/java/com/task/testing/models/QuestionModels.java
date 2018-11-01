package com.task.testing.models;

public class QuestionModels {

    private int id;
    private String text_question;
    private int subjects_id;

    public QuestionModels(int id, String text_question, int subjects_id) {
        this.id = id;
        this.text_question = text_question;
        this.subjects_id = subjects_id;
    }

    public QuestionModels() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText_question() {
        return text_question;
    }

    public void setText_question(String text_question) {
        this.text_question = text_question;
    }

    public int getSubjects_id() {
        return subjects_id;
    }

    public void setSubjects_id(int subjects_id) {
        this.subjects_id = subjects_id;
    }
}
