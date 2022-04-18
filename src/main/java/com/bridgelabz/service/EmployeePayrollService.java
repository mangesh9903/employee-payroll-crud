package com.bridgelabz.service;

import com.bridgelabz.model.EmployeePayroll;

import java.sql.SQLException;

/*********************************************************************
 * Purpose: Employee Payroll Service Interface.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 18-03-2022
 *
 **********************************************************************/
public interface EmployeePayrollService {
    int createTable() throws SQLException;
    int insertValues(EmployeePayroll employeePayroll) throws SQLException;
    void showRecords() throws SQLException;
    int updateValues(int id, EmployeePayroll employeePayroll) throws SQLException;
    int deleteValues(int id) throws SQLException;
}
