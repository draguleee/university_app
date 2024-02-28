/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.model.Attendance;
import com.mycompany.universityapp_project.repository.DBAccess;
import com.mycompany.universityapp_project.service.UniversityService;
import com.mycompany.universityapp_project.service.table.AttendancesTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author aandr
 */
public class AttendancesService {
    
    // We need to connect to the database
    private DBAccess connection;
    private AttendancesTableModel attendancesTableModel;
    
    // Constructor for AttendancesService class
    public AttendancesService(DBAccess connection) {
        this.connection = connection;
        this.attendancesTableModel = new AttendancesTableModel(connection);
    }

    public AttendancesTableModel getAttendancesTableModel() {
        return attendancesTableModel;
    }
    
    public void insertAttendance(Attendance attendance) throws SQLException {
        connection.insertEntry(attendance, att -> "INSERT INTO attendances (attendance_id, student_id, subject_id, attendances) VALUES('" 
        + att.getAttendanceId() + "','" + att.getStudentId() + "','" + att.getSubjectId() + "','" + att.getAttendances() + "')");
        attendancesTableModel.updateTable();
    }
    
    public void deleteAttendance(String table, String id, String column) throws SQLException {
        connection.deleteEntry(table, id, column);
        attendancesTableModel.updateTable();
    } 
    
    public String findAttendancesByStudentId(String studentId) {
        String s = "";
        try {
            List<Attendance> list = this.connection.getAttendancesByStudentId(studentId);
            for(Attendance attendance : list) {
                s = s + attendance.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findAttendancesBySubjectId(String subjectId) {
        String s = "";
        try {
            List<Attendance> list = this.connection.getAttendancesBySubjectId(subjectId);
            for(Attendance attendance : list) {
                s = s + attendance.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
}
