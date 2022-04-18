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
        System.out.println("3. Show All Records Of Employee Payroll.");
        System.out.println("4. Update Records Of Employee Payroll.");
        System.out.println("5. Exit From Employee Payroll.");

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
                System.out.println("--------------------  Employee Payroll Database Records ----------------------");
                payrollService.showRecords();
                System.out.println("===============================================================================");
                break;
            case 4:
                System.out.println("-----------  Employee Payroll Database Before Update Records ----------------");
                payrollService.showRecords();
                System.out.println("==============================================================================");
                System.out.println("--------updating new values---------");

                System.out.println("Enter id you want to update: ");
                int id = scanner.nextInt();
                System.out.println("Enter name to change: ");
                employeePayroll.setName(scanner.next());
                System.out.println("Enter salary to change: ");
                employeePayroll.setSalary(scanner.nextDouble());
                System.out.println("-------------  Employee Payroll Database After Update Records ----------------");
                payrollService.updateValues(id, employeePayroll);
                payrollService.showRecords();
                System.out.println("===============================================================================");

                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid Input!!!");
                break;
        }
    }
}
