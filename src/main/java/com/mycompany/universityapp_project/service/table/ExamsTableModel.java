package com.mycompany.universityapp_project.service.table;

import com.mycompany.universityapp_project.model.Exam;
import com.mycompany.universityapp_project.repository.DBAccess;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class ExamsTableModel extends AbstractTableModel {
    
    // We need to connect to the database
    private DBAccess connection;
    private List<Exam> list;
    
    // Constructor for Exams table model
    public ExamsTableModel(DBAccess connection) {
        this.connection = connection;
        updateTable();
    }
    
    // Function to update the Exams table
    public void updateTable() {
        try {
            list = connection.findEntries("SELECT * FROM exams", rs -> 
                new Exam(rs.getString("exam_id"), rs.getString("subject_id"), rs.getString("exam_type"), rs.getString("exam_date"))
            );
            fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(ExamsTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Function to get the row count for the Exams table
    @Override
    public int getRowCount() { return list != null ? list.size() : 0; }

    // Function to get the column count for the Exams table
    @Override
    public int getColumnCount() { return 4; }

    // Function to provide the data that should be displayed in each cell of the table
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list == null || list.isEmpty()) return null;
        Exam e = list.get(rowIndex);
        switch(columnIndex) {
            case 0: return e.getExamId();
            case 1: return e.getSubjectId();
            case 2: return e.getExamType();
            case 3: return e.getExamDate();
            default: throw new IllegalArgumentException("Invalid column index");
        }
    }
}