package com.employee_mgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeName;
    private String employeeEmail;
    private Long employeePhone;
    private String employeeGender;
    private String employeeSalary;
    private String employeeRole;

    public Employee() {
    }

    public Employee(Long id, String employeeName, String employeeEmail,
                    Long employeePhone, String employeeGender,
                    String employeeSalary, String employeeRole) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeePhone = employeePhone;
        this.employeeGender = employeeGender;
        this.employeeSalary = employeeSalary;
        this.employeeRole = employeeRole;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public Long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(Long employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }
}
