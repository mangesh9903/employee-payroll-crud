package com.bridgelabz.serviceimpl;

import com.bridgelabz.repository.DbConnection;
import com.bridgelabz.service.EmployeePayrollService;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/*********************************************************************
 * Purpose: Employee Payroll Service Implementation Class.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 18-03-2022
 *
 **********************************************************************/
public class EmployeePayrollServiceImpl implements EmployeePayrollService {
    public static Connection connection = DbConnection.getConnection();
    public static Statement statement = null;

    /** Method :- Method for Creating table in Database
     *
     * @return It will Create Table in DataBase.
     * @throws SQLException
     */
    public int createTable() throws SQLException {
        String sql = "CREATE TABLE EmployeePayroll( id int primary key, name varchar(50), salary varchar(50))";
        statement = connection.createStatement();
        System.out.println("Created Table Successfully.");
        return statement.executeUpdate(sql);
    }
}
