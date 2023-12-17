package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.model.Attendance;
import com.mycompany.universityapp_project.repository.DBAccess;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class AttendancesTableModel extends AbstractTableModel {
    
    private DBAccess connection;
    private List<Attendance> list;
    
    public AttendancesTableModel(DBAccess connection) {
        this.connection = connection;
        updateTable();
    }
    
    public void updateTable() {
        try {
            list = connection.findEntries("SELECT * FROM attendances", rs -> 
                new Attendance(rs.getString("attendance_id"), rs.getString("student_id"), rs.getString("subject_id"), rs.getInt("attendances"))
            );
            fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(AttendancesTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return list != null ? list.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Attendance a = list.get(rowIndex);
        switch(columnIndex) {
            case 0: return a.getAttendanceId();
            case 1: return a.getStudentId();
            case 2: return a.getSubjectId();
            case 3: return a.getAttendances();
            default: throw new IllegalArgumentException("Invalid column index");
        }
    }
}