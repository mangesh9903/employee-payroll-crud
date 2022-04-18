package com.bridgelabz.controller;

import com.bridgelabz.model.EmployeePayroll;
import com.bridgelabz.service.EmployeePayrollService;
import com.bridgelabz.serviceimpl.EmployeePayrollServiceImpl;

import java.sql.SQLException;

/*********************************************************************
 * Purpose: Class Home Controller.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 18-03-2022
 *
 **********************************************************************/
public class HomeController {
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to Employee Payroll Crud Application.");
        EmployeePayrollService payrollService = new EmployeePayrollServiceImpl();
        payrollService.createTable();
    }
}
