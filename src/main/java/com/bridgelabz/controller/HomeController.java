package com.bridgelabz.controller;

import com.bridgelabz.model.EmployeePayroll;
import com.bridgelabz.service.EmployeePayrollService;
import com.bridgelabz.serviceimpl.EmployeePayrollServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

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
        EmployeePayroll employeePayroll = new EmployeePayroll();
        EmployeePayrollService payrollService = new EmployeePayrollServiceImpl();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Create Table.");
        System.out.println("2. Insert Data in Employee Payroll.");
        System.out.println("3. Exit From Employee Payroll.");

        int ch = scanner.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Table Created Successfully.");
                payrollService.createTable();
                break;
            case 2:
                System.out.println("Insert New Data.");
                System.out.println("Enter ID: ");
                employeePayroll.setId(scanner.nextInt());
                System.out.println("Enter Name: ");
                employeePayroll.setName(scanner.next());
                System.out.println("Enter Salary: ");
                employeePayroll.setSalary(scanner.nextDouble());
                payrollService.insertValues(employeePayroll);
                System.out.println("Data Inserted Successfully.");
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid Input!!!");
                break;
        }
    }
}
