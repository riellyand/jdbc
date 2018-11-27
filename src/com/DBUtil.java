package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&amp;characterEncoding=utf-8";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static Connection conn = null;

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select user_name,age from goddess ");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("user_name") + "," + resultSet.getString("age"));
        }
    }
}
