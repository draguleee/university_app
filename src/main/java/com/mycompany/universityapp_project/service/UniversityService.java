package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.service.table.AttendancesTableModel;
import com.mycompany.universityapp_project.service.table.GradesTableModel;
import com.mycompany.universityapp_project.service.table.DepartmentsTableModel;
import com.mycompany.universityapp_project.service.table.StudentsTableModel;
import com.mycompany.universityapp_project.service.table.SubjectsTableModel;
import com.mycompany.universityapp_project.service.table.ExamsTableModel;
import com.mycompany.universityapp_project.repository.DBAccess;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

public class UniversityService {
    
    // Declare the entity services
    private DBAccess connection;
    private AttendancesService attendancesService;
    private DepartmentsService departmentsService;
    private ExamsService examsService;
    private GradesService gradesService;
    private StudentsService studentsService;
    private SubjectsService subjectsService;
    
    // Constructor for UniversityService class
    public UniversityService() throws SQLException {
        connection = ConnectionManager.getConnection();
        attendancesService = new AttendancesService(connection);
        departmentsService = new DepartmentsService(connection);
        examsService = new ExamsService(connection);
        gradesService = new GradesService(connection);
        studentsService = new StudentsService(connection);
        subjectsService = new SubjectsService(connection);
    }
    
    // Getters for the table models
    public AttendancesTableModel getAttendancesTableModel() { return attendancesService.getAttendancesTableModel(); }
    public DepartmentsTableModel getDepartmentsTableModel() { return departmentsService.getDepartmentsTableModel(); }
    public ExamsTableModel getExamsTableModel() { return examsService.getExamsTableModel(); }
    public GradesTableModel getGradesTableModel() { return gradesService.getGradesTableModel(); }
    public StudentsTableModel getStudentsTableModel() { return studentsService.getStudentsTableModel(); }
    public SubjectsTableModel getSubjectsTableModel() { return subjectsService.getSubjectsTableModel(); }
    
    
    // Method to populate the comboboxes
    public void populate(JComboBox<String> comboBox, String column, String table) {
        try {
            connection.populateComboBox(comboBox, column, table);
        } catch (SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    // Method to populate the comboboxes by another entity
    public void populateBy(JComboBox<String> comboBox, String table, String column1, String column2, String columnValue) {
        try {
            connection.populateByComboBox(comboBox, table, column1, column2, columnValue);
        } catch (SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
        }
    }    
    
    // Method to populate the comboboxes by another entity (unique entries only!)
    public void populateByDistinct(JComboBox<String> comboBox, String table1, String table2, String column, String condition) {
        try {
            connection.populateByDistinctComboBox(comboBox, table1, table2, column, condition);
        } catch (SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
        }
    }    
}