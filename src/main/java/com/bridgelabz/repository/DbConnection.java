package com.bridgelabz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*********************************************************************
 * Purpose: Class for JDBC Connection.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 18-03-2022
 *
 **********************************************************************/
public class DbConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/DemoBridgelabz";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    static Connection connection = null;

    /** Method :- Method for JDBC Connection.
     *
     * @return returning connection Object.
     */
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
