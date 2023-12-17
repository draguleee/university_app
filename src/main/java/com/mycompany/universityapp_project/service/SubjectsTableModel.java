package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.model.Subject;
import com.mycompany.universityapp_project.repository.DBAccess;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class SubjectsTableModel extends AbstractTableModel {
    
    private DBAccess connection;
    private List<Subject> list;
    
    public SubjectsTableModel(DBAccess connection) {
        this.connection = connection;
        updateTable();
    }
    
    public void updateTable() {
        try {
            list = connection.findEntries("SELECT * FROM subjects", rs -> 
                new Subject(rs.getString("subject_id"), rs.getString("department_id"), rs.getString("subject_name"), rs.getString("professor"), rs.getInt("credits"))
            );
            fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(SubjectsTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public int getRowCount() {
        return list != null ? list.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Subject s = list.get(rowIndex);
        switch(columnIndex) {
            case 0: return s.getDepartmentId();
            case 1: return s.getSubjectId();
            case 2: return s.getSubjectName();
            case 3: return s.getProfessor();
            case 4: return s.getCredits();
            default: throw new IllegalArgumentException("Invalid column index");
        }
    }
}