package com.mycompany.universityapp_project;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.universityapp_project.service.UniversityService;
import com.mycompany.universityapp_project.ui.UniversityApp;

public class MainApp {
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        UniversityService us = new UniversityService();
        UniversityApp ua = new UniversityApp(us);
        ua.setVisible(true);
    }
}