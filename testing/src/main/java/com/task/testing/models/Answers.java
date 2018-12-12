package com.task.testing.models;

public class Answers {

    private int id;
    private String textAnswers;
    private int questionID;
    private int testID;

    public Answers(int id, String textAnswers, int questionID, int testID) {
        this.id = id;
        this.textAnswers = textAnswers;
        this.questionID = questionID;
        this.testID = testID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextAnswers() {
        return textAnswers;
    }

    public void setTextAnswers(String textAnswers) {
        this.textAnswers = textAnswers;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
    }


}
