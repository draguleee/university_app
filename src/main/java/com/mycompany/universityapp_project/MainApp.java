package com.mycompany.universityapp_project;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.universityapp_project.service.UniversityService;
import com.mycompany.universityapp_project.ui.UniversityApp;
import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        
        // Set up Flat Dark Look and Feel
        FlatDarkLaf.setup();
        
        // Main App
        UniversityService us = new UniversityService();
        UniversityApp ua = new UniversityApp(us);
        ua.setVisible(true);
        
    }
}