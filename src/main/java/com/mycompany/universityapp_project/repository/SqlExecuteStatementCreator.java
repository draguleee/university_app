package com.mycompany.universityapp_project.repository;

public interface SqlExecuteStatementCreator<T> {
    String createExecuteStatement(T object);
}