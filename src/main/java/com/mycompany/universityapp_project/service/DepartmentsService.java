/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.model.Department;
import com.mycompany.universityapp_project.repository.DBAccess;
import com.mycompany.universityapp_project.service.UniversityService;
import com.mycompany.universityapp_project.service.table.DepartmentsTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aandr
 */
public class DepartmentsService {
    
    // We need to connect to the database
    private DBAccess connection;
    private DepartmentsTableModel departmentsTableModel;

    public DepartmentsService(DBAccess connection) {
        this.connection = connection;
        this.departmentsTableModel = new DepartmentsTableModel(connection);
    }

    public DepartmentsTableModel getDepartmentsTableModel() {
        return departmentsTableModel;
    }
    
    public void insertDepartment(Department department) throws SQLException {
        connection.insertEntry(department, dept -> "INSERT INTO departments (department_id, department_name, years, type) VALUES('" 
        + dept.getDepartmentId() + "','" + dept.getDepartmentName() + "'," + dept.getYears() + ",'" + dept.getType() + "')");
        departmentsTableModel.updateTable();
    }
    
    public void deleteDepartment(String table, String id, String column) throws SQLException {
        connection.deleteEntry(table, id, column);
        departmentsTableModel.updateTable();
    } 
    
    public String findDepartmentsByYears(int years) {
        String s = "";
        try {
            List<Department> list = this.connection.getDepartmentsByYears(years);
            for(Department department : list) {
                s = s + department.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    } 
    
    public String findDepartmentsByType(String type) {
        String s = "";
        try {
            List<Department> list = this.connection.getDepartmentsByType(type);
            for(Department department : list) {
                s = s + department.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    } 
    
}
