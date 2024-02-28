package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.repository.DBAccess;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {
    public static DBAccess getConnection() throws SQLException {
        try {
            return new DBAccess();
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, e);
            System.exit(1);
            return null; 
        }
    }
}