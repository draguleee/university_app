/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.model.Student;
import com.mycompany.universityapp_project.repository.DBAccess;
import com.mycompany.universityapp_project.service.UniversityService;
import com.mycompany.universityapp_project.service.table.StudentsTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author aandr
 */
public class StudentsService {
    
    // We need to connect to the database
    private DBAccess connection;
    private StudentsTableModel studentsTableModel;

    // Constructor for StudentsService class
    public StudentsService(DBAccess connection) {
        this.connection = connection;
        this.studentsTableModel = new StudentsTableModel(connection);
    }

    public StudentsTableModel getStudentsTableModel() {
        return studentsTableModel;
    }
    
    public void populateEligibleStudentsByDepartment(JComboBox<String> comboBox, String departmentId) {
        try {
            connection.populateEligibleStudentsByDepartmentComboBox(comboBox, departmentId);
        } catch (SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void insertStudent(Student student) throws SQLException {
        connection.insertEntry(student, stud -> "INSERT INTO students (student_id, department_id, name, surname, address, phone) VALUES('" 
        + stud.getStudentId() + "','" + stud.getDepartmentId() + "','" + stud.getName() + "','" + stud.getSurname() + "','" + stud.getAddress() + "','" + stud.getPhone() + "')");
        studentsTableModel.updateTable();
    }
    
    public void deleteStudent(String table, String id, String column) throws SQLException {
        connection.deleteEntry(table, id, column);
        studentsTableModel.updateTable();
    } 
    
    public String findStudentsByDepartmentId(String department) {
        String s = "";
        try {
            List<Student> list = this.connection.getStudentsByDepartmentId(department);
            for(Student student : list) {
                s = s + student.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findEligibleStudents(String departmentId, String subjectId) {
        String s = "";
        try {
            List<Student> list = this.connection.getEligbleStudentsForExams(departmentId, subjectId);
            s = "Eligible Students for subject " + subjectId + ":\n";
            for(Student student : list) {
                s = s + student.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    
}
