package com.bridgelabz.serviceimpl;

import com.bridgelabz.model.EmployeePayroll;
import com.bridgelabz.repository.DbConnection;
import com.bridgelabz.service.EmployeePayrollService;

import java.sql.Connection;
import java.sql.ResultSet;
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

    /**
     * Method :- Method for Creating table in Database
     *
     * @return It will Create Table in DataBase.
     * @throws SQLException
     */
    public int createTable() throws SQLException {
        String sql = "CREATE TABLE EmployeePayroll( id int primary key, name varchar(50), salary varchar(50))";
        statement = connection.createStatement();
        return statement.executeUpdate(sql);
    }

    /**
     * Method :- Method for Insert data into table.
     *
     * @param employeePayroll passing EmployeePayroll Object as a input.
     * @return inserting data in data base.
     * @throws SQLException
     */
    @Override
    public int insertValues(EmployeePayroll employeePayroll) throws SQLException {
        String sqlQuery = "insert into EmployeePayroll values(" + employeePayroll.getId() + ",'"
                + employeePayroll.getName() + "','"
                + employeePayroll.getSalary() + "')";
        statement = connection.createStatement();
        return statement.executeUpdate(sqlQuery);
    }

    /**
     * Method :- Shows All Records Present In Table.
     *
     * @throws SQLException
     */
    @Override
    public void showRecords() throws SQLException {
        String sqlQuery = "select * from EmployeePayroll";
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(" ID :- " + resultSet.getInt("id") + " Name :- "
                    + resultSet.getString("name") + " Salary :- " + resultSet.getString("salary"));
        }

    }

    /**
     * Method:- Method for Update Existing Values From DataBase.
     *
     * @param id              Passing Id Of Employee who want to update
     * @param employeePayroll passing Employee Payroll Object as a input
     * @return update values.
     * @throws SQLException
     */
    @Override
    public int updateValues(int id, EmployeePayroll employeePayroll) throws SQLException {
        String sqlQuery = "UPDATE EmployeePayroll SET name='" + employeePayroll.getName() + "', salary='" + employeePayroll.getSalary()
                + "' WHERE id=" + id + "";
        statement = connection.createStatement();
        return statement.executeUpdate(sqlQuery);
    }
}
