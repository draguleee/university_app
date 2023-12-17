package com.mycompany.universityapp_project.service;

import com.mycompany.universityapp_project.model.*;
import com.mycompany.universityapp_project.repository.DBAccess;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import javax.swing.JComboBox;

public class UniversityService {
    
    private DBAccess connection;
    private DepartmentsTableModel departmentsTableModel;
    private SubjectsTableModel subjectsTableModel;
    private StudentsTableModel studentsTableModel;
    private AttendancesTableModel attendancesTableModel;
    private ExamsTableModel examsTableModel;
    private GradesTableModel gradesTableModel;
    
    public UniversityService() {
        try {
            connection = new DBAccess();
        } catch(ClassNotFoundException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
            System.exit(1);
        } catch(SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
            System.exit(1);
        }
        departmentsTableModel = new DepartmentsTableModel(connection);
        subjectsTableModel = new SubjectsTableModel(connection);
        studentsTableModel = new StudentsTableModel(connection);
        attendancesTableModel = new AttendancesTableModel(connection);
        examsTableModel = new ExamsTableModel(connection);
        gradesTableModel = new GradesTableModel(connection);
    }
    
    public DepartmentsTableModel getDepartmentsTableModel() {
        return departmentsTableModel;
    }
    
    public SubjectsTableModel getSubjectsTableModel() {
        return subjectsTableModel;
    }
    
    public StudentsTableModel getStudentsTableModel() {
        return studentsTableModel;
    }
    
    public AttendancesTableModel getAttendancesTableModel() {
        return attendancesTableModel;
    }
    
    public ExamsTableModel getExamsTableModel() {
        return examsTableModel;
    }
    
    public GradesTableModel getGradesTableModel() {
        return gradesTableModel;
    }
    
    
    public void populate(JComboBox<String> comboBox, String column, String table) {
        try {
            connection.populateComboBox(comboBox, column, table);
        } catch (SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void populateBy(JComboBox<String> comboBox, String table, String column1, String column2, String columnValue) {
        try {
            connection.populateByComboBox(comboBox, table, column1, column2, columnValue);
        } catch (SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
        }
    }    
    
    public void populateByDistinct(JComboBox<String> comboBox, String table1, String table2, String column, String condition) {
        try {
            connection.populateByDistinctComboBox(comboBox, table1, table2, column, condition);
        } catch (SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void populateEligibleStudentsByDepartment(JComboBox<String> comboBox, String departmentId) {
        try {
            connection.populateEligibleStudentsByDepartmentComboBox(comboBox, departmentId);
        } catch (SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void populateExamsForEligibleStudents(JComboBox<String> comboBox, String departmentId, String studentId) {
        try {
            connection.populateExamsForEligibleStudentsComboBox(comboBox, departmentId, studentId);
        } catch (SQLException e) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
    /*
    * Functions for INSERTING entries in university database for the following tables: departments, subjects, students, attendances, exams, grades
    */
    public void insertDepartment(Department department) throws SQLException {
        connection.insertEntry(department, dept -> "INSERT INTO departments (department_id, department_name, years, type) VALUES('" 
        + dept.getDepartmentId() + "','" + dept.getDepartmentName() + "'," + dept.getYears() + ",'" + dept.getType() + "')");
        departmentsTableModel.updateTable();
    }
    
    public void insertSubject(Subject subject) throws SQLException {
        connection.insertEntry(subject, subj -> "INSERT INTO subjects (subject_id, department_id, subject_name, professor, credits) VALUES('" 
        + subj.getSubjectId() + "','" + subj.getDepartmentId() + "','" + subj.getSubjectName() + "','" + subj.getProfessor() + "'," + subj.getCredits() + ")");
        subjectsTableModel.updateTable();
    }
    
    public void insertStudent(Student student) throws SQLException {
        connection.insertEntry(student, stud -> "INSERT INTO students (student_id, department_id, name, surname, address, phone) VALUES('" 
        + stud.getStudentId() + "','" + stud.getDepartmentId() + "','" + stud.getName() + "','" + stud.getSurname() + "','" + stud.getAddress() + "','" + stud.getPhone() + "')");
        studentsTableModel.updateTable();
    }
    
    public void insertAttendance(Attendance attendance) throws SQLException {
        connection.insertEntry(attendance, att -> "INSERT INTO attendances (attendance_id, student_id, subject_id, attendances) VALUES('" 
        + att.getAttendanceId() + "','" + att.getStudentId() + "','" + att.getSubjectId() + "','" + att.getAttendances() + "')");
        attendancesTableModel.updateTable();
    }
    
    public void insertExam(Exam exam) throws SQLException {
        connection.insertEntry(exam, ex -> "INSERT INTO exams (exam_id, subject_id, exam_type, exam_date) VALUES('" 
        + ex.getExamId() + "','" + ex.getSubjectId() + "','" + ex.getExamType() + "','" + ex.getExamDate() + "')");
        examsTableModel.updateTable();
    }
    
    public void insertGrade(Grade grade) throws SQLException {
        connection.insertEntry(grade, grd -> "INSERT INTO grades (grade_id, student_id, exam_id, grade) VALUES('" 
        + grd.getGradeId() + "','" + grd.getStudentId() + "','" + grd.getExamId() + "'," + grd.getGrade() + ")");
        gradesTableModel.updateTable();
    }
    
    
    /*
    * Function for DELETING entries in university database for the following tables: departments, subjects, students, attendances, exams, grades
    */
    public void delete(String table, String id, String column) throws SQLException {
        connection.deleteEntry(table, id, column);
        departmentsTableModel.updateTable();
        subjectsTableModel.updateTable();
        studentsTableModel.updateTable();
        attendancesTableModel.updateTable();
        examsTableModel.updateTable();
        gradesTableModel.updateTable();
    }
    
   

    public String findDepartmentsByYears(int years) {
        String s = "";
        try {
            List<Department> list = this.connection.getDepartmentsByYears(years);
            for(Department department : list) {
                s = s + department.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    } 
    
    public String findDepartmentsByType(String type) {
        String s = "";
        try {
            List<Department> list = this.connection.getDepartmentsByType(type);
            for(Department department : list) {
                s = s + department.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    } 
    
    public String findSubjectsByDepartmentId(String departmentId) {
        String s = "";
        try {
            List<Subject> list = this.connection.getSubjectsByDepartmentId(departmentId);
            for(Subject subject : list) {
                s = s + subject.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    } 
    
    public String findSubjectsByProfessor(String professor) {
        String s = "";
        try {
            List<Subject> list = this.connection.getSubjectsByProfessor(professor);
            for(Subject subject : list) {
                s = s + subject.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findSubjectsByCredits(int credits) {
        String s = "";
        try {
            List<Subject> list = this.connection.getSubjectsByCredits(credits);
            for(Subject subject : list) {
                s = s + subject.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findStudentsByDepartmentId(String department) {
        String s = "";
        try {
            List<Student> list = this.connection.getStudentsByDepartmentId(department);
            for(Student student : list) {
                s = s + student.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findAttendancesByStudentId(String studentId) {
        String s = "";
        try {
            List<Attendance> list = this.connection.getAttendancesByStudentId(studentId);
            for(Attendance attendance : list) {
                s = s + attendance.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findAttendancesBySubjectId(String subjectId) {
        String s = "";
        try {
            List<Attendance> list = this.connection.getAttendancesBySubjectId(subjectId);
            for(Attendance attendance : list) {
                s = s + attendance.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findEligibleStudents(String departmentId, String subjectId) {
        String s = "";
        try {
            List<Student> list = this.connection.getEligbleStudentsForExams(departmentId, subjectId);
            s = "Eligible Students for subject " + subjectId + ":\n";
            for(Student student : list) {
                s = s + student.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findExamsBySubjectId(String subjectId) {
        String s = "";
        try {
            List<Exam> list = this.connection.getExamBySubjectId(subjectId);
            for(Exam exam : list) {
                s = s + exam.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findExamsByExamType(String examType) {
        String s = "";
        try {
            List<Exam> list = this.connection.getExamByExamType(examType);
            for(Exam exam : list) {
                s = s + exam.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findGradesByStudentId(String studentId) {
        String s = "";
        try {
            List<Grade> list = this.connection.getGradeByStudentId(studentId);
            s = "Grades for student: " + studentId + ":\n";
            for(Grade grade : list) {
                s = s + grade.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public String findGradesByExamId(String examId) {
        String s = "";
        try {
            List<Grade> list = this.connection.getGradeByExamId(examId);
            s = "Grades for exam ID: " + examId + ":\n";
            for(Grade grade : list) {
                s = s + grade.toString() + "\n";
            }
            s += "-------------------"; 
        } catch(SQLException ex) {
            Logger.getLogger(UniversityService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
}