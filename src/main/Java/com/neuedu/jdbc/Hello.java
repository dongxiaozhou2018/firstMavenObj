package com.neuedu.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Hello {

public static void main(String[] args) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection("","","");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
