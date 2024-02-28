/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.model.Subject;
import com.mycompany.universityapp_project.repository.DBAccess;
import com.mycompany.universityapp_project.service.UniversityService;
import com.mycompany.universityapp_project.service.table.SubjectsTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aandr
 */
public class SubjectsService {
    
    // We need to connect to the database
    private DBAccess connection;
    private SubjectsTableModel subjectsTableModel;
    
    // Constructor for SubjectsService class
    public SubjectsService(DBAccess connection) {
        this.connection = connection;
        this.subjectsTableModel = new SubjectsTableModel(connection);
    }

    public SubjectsTableModel getSubjectsTableModel() {
        return subjectsTableModel;
    }
    
    public void insertSubject(Subject subject) throws SQLException {
        connection.insertEntry(subject, subj -> "INSERT INTO subjects (subject_id, department_id, subject_name, professor, credits) VALUES('" 
        + subj.getSubjectId() + "','" + subj.getDepartmentId() + "','" + subj.getSubjectName() + "','" + subj.getProfessor() + "'," + subj.getCredits() + ")");
        subjectsTableModel.updateTable();
    }
    
    public void deleteSubject(String table, String id, String column) throws SQLException {
        connection.deleteEntry(table, id, column);
        subjectsTableModel.updateTable();
    } 
    
    public String findSubjectsByDepartmentId(String departmentId) {
        String s = "";
        try {
            List<Subject> list = this.connection.getSubjectsByDepartmentId(departmentId);
            for(Subject subject : list) {
                s = s + subject.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    } 
    
    public String findSubjectsByProfessor(String professor) {
        String s = "";
        try {
            List<Subject> list = this.connection.getSubjectsByProfessor(professor);
            for(Subject subject : list) {
                s = s + subject.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findSubjectsByCredits(int credits) {
        String s = "";
        try {
            List<Subject> list = this.connection.getSubjectsByCredits(credits);
            for(Subject subject : list) {
                s = s + subject.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
}
