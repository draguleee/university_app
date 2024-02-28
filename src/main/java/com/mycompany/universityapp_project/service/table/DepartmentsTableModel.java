package com.mycompany.universityapp_project.service.table;

import com.mycompany.universityapp_project.model.Department;
import com.mycompany.universityapp_project.repository.DBAccess;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class DepartmentsTableModel extends AbstractTableModel {
    
    // We need to connect to the database
    private DBAccess connection;
    private List<Department> list;
    
    // Constructor for the Departments table model
    public DepartmentsTableModel(DBAccess connection) {
        this.connection = connection;
        updateTable();
    }
    
    // Function to update the Departments table
    public void updateTable() {
        try {
            list = connection.findEntries("SELECT * FROM departments", rs -> 
                new Department(rs.getString("department_id"), rs.getString("department_name"), rs.getInt("years"), rs.getString("type"))
            );
            fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentsTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Function to get the row count for the Departments table
    @Override
    public int getRowCount() { return list != null ? list.size() : 0; }

    // Function to get the column count for the Departments table
    @Override
    public int getColumnCount() { return 4; }

    // Function to provide the data that should be displayed in each cell of the table
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list == null || list.isEmpty()) return null;
        Department d = list.get(rowIndex);
        switch(columnIndex) {
            case 0: return d.getDepartmentId();
            case 1: return d.getDepartmentName();
            case 2: return d.getYears();
            case 3: return d.getType();
            default: throw new IllegalArgumentException("Invalid column index");
        }
    }
}