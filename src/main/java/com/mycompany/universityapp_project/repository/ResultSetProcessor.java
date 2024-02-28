/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityapp_project.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetProcessor<T> {
    T process(ResultSet rs) throws SQLException;
}