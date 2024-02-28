package com.mycompany.universityapp_project.repository;

import com.mycompany.universityapp_project.model.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class DBAccess {
    
    private Connection connection;
    
    public DBAccess() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");          
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","12.34-56.78");
        connection.setAutoCommit(true);
    }
    
    public void populateComboBox(JComboBox<String> comboBox, String column, String table) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ResultSet rs = s.executeQuery("SELECT " + column + " FROM " + table);
            while (rs.next()) {
                if (comboBox != null) {
                    comboBox.addItem(rs.getString(column));
                } else {
                    comboBox = new JComboBox<String>();
                } 
            }
        }
    }
    
    public void populateByComboBox(JComboBox<String> comboBox, String table, String column1, String column2, String columnValue) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ResultSet rs = s.executeQuery("SELECT " + column1 + " FROM " + table + " WHERE " + column2 + " = '" + columnValue + "'");
            while (rs.next()) {
                if (comboBox != null) {
                    comboBox.addItem(rs.getString(column1));
                } else {
                    comboBox = new JComboBox<String>();
                } 
            }
        }
    }
    
    public void populateByDistinctComboBox(JComboBox<String> comboBox, String table1, String table2, String column, String condition) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ResultSet rs = s.executeQuery("SELECT DISTINCT " + table1 + "." + column + " FROM " + table1 + 
                    " JOIN " + table2 + " ON " + table1 + "." + column + "=" + table2 + "." + column + " " 
                    + condition + " LIMIT 0, 1000");
            while (rs.next()) {
                if (comboBox != null) {
                    comboBox.addItem(rs.getString(column));
                } else {
                    comboBox = new JComboBox<String>();
                } 
            }
        }
    }
    
    public void populateEligibleStudentsByDepartmentComboBox(JComboBox<String> comboBox, String departmentId) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ResultSet rs = s.executeQuery("SELECT DISTINCT students.student_id FROM students " 
                    + "JOIN attendances ON students.student_id=attendances.student_id " 
                    + "WHERE attendances.attendances>=5 AND students.department_id='" + departmentId + "'");
            while (rs.next()) {
                if (comboBox != null) {
                    comboBox.addItem(rs.getString("student_id"));
                } else {
                    comboBox = new JComboBox<String>();
                } 
            }
        }
    }
    
    public void populateExamsForEligibleStudentsComboBox(JComboBox<String> comboBox, String departmentId, String studentId) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ResultSet rs = s.executeQuery("SELECT DISTINCT exams.exam_id FROM exams "
                    + "JOIN subjects ON exams.subject_id = subjects.subject_id "
                    + "JOIN attendances ON subjects.subject_id = attendances.subject_id "
                    + "JOIN students ON attendances.student_id = students.student_id "
                    + "WHERE students.department_id = '" + departmentId + "' "
                    + "AND students.student_id = '" + studentId + "' "
                    + "AND attendances.attendances >= 5");
            while (rs.next()) {
                if (comboBox != null) {
                    comboBox.addItem(rs.getString("exam_id"));
                } else {
                    comboBox = new JComboBox<String>();
                } 
            }
        }
    }
    
    public List<Student> getEligbleStudentsForExams(String departmentId, String subjectId) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Student> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT DISTINCT * FROM students "
                    + "JOIN attendances ON students.student_id = attendances.student_id "
                    + "JOIN subjects ON attendances.subject_id = subjects.subject_id "
                    + "WHERE students.department_id = '" + departmentId + "' "
                    + "AND subjects.subject_id = '" + subjectId + "' "
                    + "AND attendances.attendances >= 5");
            while (rs.next()) {
                list.add(new Student(rs.getString("student_id"), rs.getString("department_id"), rs.getString("name"), rs.getString("surname"), rs.getString("address"), rs.getString("phone")));
            }
            return list;
        }
    }
    
    public <T> void insertEntry(T object, SqlExecuteStatementCreator<T> statementCreator) throws SQLException {
        try (Statement s = connection.createStatement()) {
            String sql = statementCreator.createExecuteStatement(object);
            s.executeUpdate(sql);
        }
    }
    
    public <T> List<T> findEntries(String sqlQuery, ResultSetProcessor<T> processor) throws SQLException {
        List<T> list = new ArrayList<>();
        try (Statement s = connection.createStatement()) {
            ResultSet rs = s.executeQuery(sqlQuery);
            while (rs.next()) {
                list.add(processor.process(rs));
            }
        }
        return list;
    }
    
    public void deleteEntry(String table, String id, String column) throws SQLException {
        try (Statement s = connection.createStatement()) {
            s.executeUpdate("DELETE FROM " + table + " WHERE " + id + "_id = '" + column + "'");
        }
    }
    
    
    public List<Department> getDepartmentsByYears(int years) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Department> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM departments WHERE years = " + years + "");
            while (rs.next()) {
                list.add(new Department(rs.getString("department_id"), rs.getString("department_name"), rs.getInt("years"), rs.getString("type")));
            }
            return list;
        }
    }
    
    public List<Department> getDepartmentsByType(String type) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Department> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM departments WHERE type = '" + type + "'");
            while (rs.next()) {
                list.add(new Department(rs.getString("department_id"), rs.getString("department_name"), rs.getInt("years"), rs.getString("type")));
            }
            return list;
        }
    }
    
    
    public List<Subject> getSubjectsByDepartmentId(String departmentId) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Subject> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM subjects WHERE department_id = '" + departmentId + "'");
            while (rs.next()) {
                list.add(new Subject(rs.getString("subject_id"), rs.getString("department_id"), rs.getString("subject_name"), rs.getString("professor"), rs.getInt("credits")));
            }
            return list;
        }
    }
    
    public List<Subject> getSubjectsByProfessor(String professor) throws SQLException {
        try(Statement s = connection.createStatement()) {
            ArrayList<Subject> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM subjects WHERE professor = '" + professor + "'");
            while (rs.next()) {
                list.add(new Subject(rs.getString("subject_id"), rs.getString("department_id"), rs.getString("subject_name"), rs.getString("professor"), rs.getInt("credits")));
            }
            return list;
        }
    }
    
    public List<Subject> getSubjectsByCredits (int credits) throws SQLException {
        try(Statement s = connection.createStatement()) {
            ArrayList<Subject> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM subjects WHERE credits = " + credits + "");
            while (rs.next()) {
                list.add(new Subject(rs.getString("subject_id"), rs.getString("department_id"), rs.getString("subject_name"), rs.getString("professor"), rs.getInt("credits")));
            }
            return list;
        }
    }
    
   
    public List<Student> getStudentsByDepartmentId(String departmentId) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Student> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM students WHERE department_id = '" + departmentId + "'");
            while (rs.next()) {
                list.add(new Student(rs.getString("student_id"), rs.getString("department_id"), rs.getString("name"), rs.getString("surname"), rs.getString("address"), rs.getString("phone")));
            }
            return list;
        }
    }
   
    public List<Attendance> getAttendancesByStudentId(String studentId) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Attendance> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM attendances WHERE student_id = '" + studentId + "'");
            while (rs.next()) {
                list.add(new Attendance(rs.getString("attendance_id"), rs.getString("student_id"), rs.getString("subject_id"), rs.getInt("attendances")));
            }
            return list;
        }
    }
    
    public List<Attendance> getAttendancesBySubjectId(String subjectId) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Attendance> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM attendances WHERE subject_id = '" + subjectId + "'");
            while (rs.next()) {
                list.add(new Attendance(rs.getString("attendance_id"), rs.getString("student_id"), rs.getString("subject_id"), rs.getInt("attendances")));
            }
            return list;
        }
    }
    
    
    
    public List<Exam> getExamBySubjectId(String subjectId) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Exam> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM exams WHERE subject_id = '" + subjectId + "'");
            while (rs.next()) {
                list.add(new Exam(rs.getString("exam_id"), rs.getString("subject_id"), rs.getString("exam_type"), rs.getString("exam_date")));
            }
            return list;
        }
    }
    
    public List<Exam> getExamByExamType(String examType) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Exam> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM exams WHERE exam_type = '" + examType + "'");
            while (rs.next()) {
                list.add(new Exam(rs.getString("exam_id"), rs.getString("subject_id"), rs.getString("exam_type"), rs.getString("exam_date")));
            }
            return list;
        }
    }
    
    public List<Grade> getGradeByStudentId(String studentId) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Grade> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM grades WHERE student_id = '" + studentId + "'");
            while (rs.next()) {
                list.add(new Grade(rs.getString("grade_id"), rs.getString("student_id"), rs.getString("exam_id"), rs.getInt("grade")));
            }
            return list;
        }
    }
    
     public List<Grade> getGradeByExamId(String examId) throws SQLException {
        try (Statement s = connection.createStatement()) {
            ArrayList<Grade> list = new ArrayList<>();
            ResultSet rs = s.executeQuery("SELECT * FROM grades WHERE exam_id = '" + examId + "'");
            while (rs.next()) {
                list.add(new Grade(rs.getString("grade_id"), rs.getString("student_id"), rs.getString("exam_id"), rs.getInt("grade")));
            }
            return list;
        }
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DBAccess db = new DBAccess();
    }
}