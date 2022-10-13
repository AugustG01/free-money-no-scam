package com.example.freemoneynoscam.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {


    private static String hostname;
    private static String username;
    private static String password;
    private static Connection connection;

    //Metoder
    public static Connection getConnection() {
        hostname = "jdbc:mysql://localhost/noscam";
        username = "root";
        password = "root";
        try {

            connection = DriverManager.getConnection(hostname,username,password);

        } catch (SQLException e) {
            System.out.println("Kan ikke forbinde...");
            throw new RuntimeException(e);
        }
        System.out.println("Forbindelse Godkendt");
        return connection;
    }
}
