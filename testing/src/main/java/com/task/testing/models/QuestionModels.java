package com.task.testing.models;

public class QuestionModels {

    private int id_quest;
    private String name;

    public QuestionModels(int id_quest, String name) {
        this.id_quest = id_quest;
        this.name = name;
    }

    public QuestionModels() {}

    public int getId_quest() {
        return id_quest;
    }

    public void setId_quest(int id_quest) {
        this.id_quest = id_quest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
