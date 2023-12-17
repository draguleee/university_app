package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.model.Department;
import com.mycompany.universityapp_project.repository.DBAccess;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class DepartmentsTableModel extends AbstractTableModel {
    
    private DBAccess connection;
    private List<Department> list;
    
    public DepartmentsTableModel(DBAccess connection) {
        this.connection = connection;
        updateTable();
    }
    
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