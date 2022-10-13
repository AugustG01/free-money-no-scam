package com.example.freemoneynoscam.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriteToDatabase {

    private Connection connection = DatabaseConnectionManager.getConnection();

    public void create(String email) {

        try {
            PreparedStatement pstmt = connection.prepareStatement("insert into user(email) values (?)");
            pstmt.setString(1, email);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
