package com.mycompany.universityapp_project.service.table;

import com.mycompany.universityapp_project.model.Student;
import com.mycompany.universityapp_project.repository.DBAccess;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class StudentsTableModel extends AbstractTableModel {
    
    // We need to connect to the database
    private DBAccess connection;
    private List<Student> list;
    
    // Constructor for the Students table model
    public StudentsTableModel(DBAccess connection) {
        this.connection = connection;
        updateTable();
    }
    
    // Function to update the Students table
    public void updateTable() {
        try {
            list = connection.findEntries("SELECT * FROM students", rs -> 
                new Student(rs.getString("student_id"), rs.getString("department_id"), rs.getString("name"), rs.getString("surname"), rs.getString("address"), rs.getString("phone"))
            );
            fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Function to get the row count for the Students table
    @Override
    public int getRowCount() { return list != null ? list.size() : 0; }

    // Function to get the column count for the Students table
    @Override
    public int getColumnCount() { return 6; }

    // Function to provide the data that should be displayed in each cell of the table
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list == null || list.isEmpty()) return null;
        Student s = list.get(rowIndex);
        switch(columnIndex) {
            case 0: return s.getStudentId();
            case 1: return s.getDepartmentId();
            case 2: return s.getName();
            case 3: return s.getSurname();
            case 4: return s.getAddress();
            case 5: return s.getPhone();
            default: throw new IllegalArgumentException("Invalid column index");
        }
    }
}