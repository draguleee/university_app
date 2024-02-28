/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.model.Exam;
import com.mycompany.universityapp_project.repository.DBAccess;
import com.mycompany.universityapp_project.service.UniversityService;
import com.mycompany.universityapp_project.service.table.ExamsTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author aandr
 */
public class ExamsService {
    
    // We need to connect to the database
    private DBAccess connection;
    private ExamsTableModel examsTableModel;
    
    // Constructor for ExamsService class
    public ExamsService(DBAccess connection) {
        this.connection = connection;
        this.examsTableModel = new ExamsTableModel(connection);
    }

    public ExamsTableModel getExamsTableModel() {
        return examsTableModel;
    }
    
    public void populateExamsForEligibleStudents(JComboBox<String> comboBox, String departmentId, String studentId) {
        try {
            connection.populateExamsForEligibleStudentsComboBox(comboBox, departmentId, studentId);
        } catch (SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void insertExam(Exam exam) throws SQLException {
        connection.insertEntry(exam, ex -> "INSERT INTO exams (exam_id, subject_id, exam_type, exam_date) VALUES('" 
        + ex.getExamId() + "','" + ex.getSubjectId() + "','" + ex.getExamType() + "','" + ex.getExamDate() + "')");
        examsTableModel.updateTable();
    }
    
    public void deleteExam(String table, String id, String column) throws SQLException {
        connection.deleteEntry(table, id, column);
        examsTableModel.updateTable();
    } 
    
    public String findExamsBySubjectId(String subjectId) {
        String s = "";
        try {
            List<Exam> list = this.connection.getExamBySubjectId(subjectId);
            for(Exam exam : list) {
                s = s + exam.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findExamsByExamType(String examType) {
        String s = "";
        try {
            List<Exam> list = this.connection.getExamByExamType(examType);
            for(Exam exam : list) {
                s = s + exam.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
}
