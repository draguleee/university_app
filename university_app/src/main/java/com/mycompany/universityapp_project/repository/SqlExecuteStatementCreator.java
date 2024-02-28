/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityapp_project.repository;

/**
 *
 * @author aandr
 */
public interface SqlExecuteStatementCreator<T> {
    String createExecuteStatement(T object);
}