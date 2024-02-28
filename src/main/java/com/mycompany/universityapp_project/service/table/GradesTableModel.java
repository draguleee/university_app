package com.mycompany.universityapp_project.service.table;

import com.mycompany.universityapp_project.model.Grade;
import com.mycompany.universityapp_project.repository.DBAccess;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class GradesTableModel extends AbstractTableModel {
    
    // We need to connect to the database
    private DBAccess connection;
    private List<Grade> list;
    
    // Constructor for the Grades table model
    public GradesTableModel(DBAccess connection) {
        this.connection = connection;
        updateTable();
    }
    
    // Function to update the Grades table
    public void updateTable() {
        try {
            list = connection.findEntries("SELECT * FROM grades", rs -> 
                new Grade(rs.getString("grade_id"), rs.getString("student_id"), rs.getString("exam_id"), rs.getInt("grade"))
            );
            fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(GradesTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Function to get the row count for the Grades table
    @Override
    public int getRowCount() { return list != null ? list.size() : 0; }

    // Function to get the column count for the Grades table
    @Override
    public int getColumnCount() { return 4; }

    // Function to provide the data that should be displayed in each cell of the table
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list == null || list.isEmpty()) return null;
        Grade g = list.get(rowIndex);
        switch(columnIndex) {
            case 0: return g.getGradeId();
            case 1: return g.getStudentId();
            case 2: return g.getExamId();
            case 3: return g.getGrade();
            default: throw new IllegalArgumentException("Invalid column index");
        }
    }
}