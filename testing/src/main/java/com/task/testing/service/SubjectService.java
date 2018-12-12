package com.task.testing.service;

import com.task.testing.connector.ConnectionPool;
import com.task.testing.models.SubjectModels;
import com.task.testing.models.Subjects;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class SubjectService {

    private static final String GET_SUBJECT_QUERY = "SELECT `id`,\n" +
            "    `name`\n" +
            "FROM `subjects`;";

    public Subjects getSubjectsFromDB(SubjectModels subjectModels) {
        Subjects subjects_res = null;
        try {
            ConnectionPool connectionPool = ConnectionPool.getInstance();
            Connection connection = connectionPool.getConnection();
            String query = String.format(GET_SUBJECT_QUERY, subjectModels.getName_subj());
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                subjects_res = new Subjects(
                        resultSet.getInt("id"),
                        resultSet.getString("name_subjects")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subjects_res;
    }

}
