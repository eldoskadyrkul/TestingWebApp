package com.task.testing.service;

import com.task.testing.connector.ConnectionPool;
import com.task.testing.models.User;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import com.task.testing.models.UserLoginModels;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserService {

    private static final String SALT = "stormnet";

    private static final String GET_USER_QUERY = "SELECT `users`.`id`,\n" +
            "    `users`.`name`,\n" +
            "    `users`.`lastname`,\n" +
            "    `users`.`login`,\n" +
            "    `users`.`password`,\n" +
            "    `users`.`roles_id`\n" +
            "FROM `test-app`.`users`\n" +
            "where users.login='%s' and users.password='$s'";

    public  User getUserFromUserLogin(UserLoginModels userLoginModels) {
        User result = null;
        try {
            ConnectionPool connectionPool = ConnectionPool.getInstance();
            Connection connection = connectionPool.getConnection();
            String encodedPassword = new String(Base64.decode(SALT + userLoginModels.getPassword()));
            String query = String.format(GET_USER_QUERY, userLoginModels.getLogin(), encodedPassword);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                result = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("lastName"),
                        resultSet.getString("login"),
                        resultSet.getInt("roleId"));
            }
        } catch (SQLException | Base64DecodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
