package com.task.testing.service;


import com.task.testing.connector.ConnectionPool;
import com.task.testing.models.QuestionModels;
import com.task.testing.models.Questions;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class QuestService {

    private static final String GET_QUESTION_QUERY = "SELECT `id`,\n" +
            "    `text`,\n" +
            "FROM `questions`;\n" +
            "WHERE text=$s";

    public Questions getQuestionFromDatabase(QuestionModels questionModels) {
        Questions res = null;
        try {
            ConnectionPool connectionPool = ConnectionPool.getInstance();
            Connection connection = connectionPool.getConnection();
            String query = String.format(GET_QUESTION_QUERY, questionModels.getId_quest(), questionModels.getName());
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                res = new Questions(
                        resultSet.getInt("id"),
                        resultSet.getString("textQuestion"),
                        resultSet.getInt("subjects_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
