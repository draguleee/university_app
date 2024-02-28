/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.model.Grade;
import com.mycompany.universityapp_project.repository.DBAccess;
import com.mycompany.universityapp_project.service.UniversityService;
import com.mycompany.universityapp_project.service.table.GradesTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aandr
 */
public class GradesService {
    
    // We need to connect to the database
    private DBAccess connection;
    private GradesTableModel gradesTableModel;

    // Constructor for GradesService class
    public GradesService(DBAccess connection) {
        this.connection = connection;
        this.gradesTableModel = new GradesTableModel(connection);
    }

    public GradesTableModel getGradesTableModel() {
        return gradesTableModel;
    }
    
    public void insertGrade(Grade grade) throws SQLException {
        connection.insertEntry(grade, grd -> "INSERT INTO grades (grade_id, student_id, exam_id, grade) VALUES('" 
        + grd.getGradeId() + "','" + grd.getStudentId() + "','" + grd.getExamId() + "'," + grd.getGrade() + ")");
        gradesTableModel.updateTable();
    }
    
    public void deleteGrade(String table, String id, String column) throws SQLException {
        connection.deleteEntry(table, id, column);
        gradesTableModel.updateTable();
    } 
    
    public String findGradesByStudentId(String studentId) {
        String s = "";
        try {
            List<Grade> list = this.connection.getGradeByStudentId(studentId);
            s = "Grades for student: " + studentId + ":\n";
            for(Grade grade : list) {
                s = s + grade.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findGradesByExamId(String examId) {
        String s = "";
        try {
            List<Grade> list = this.connection.getGradeByExamId(examId);
            s = "Grades for exam ID: " + examId + ":\n";
            for(Grade grade : list) {
                s = s + grade.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
}
