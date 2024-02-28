package com.mycompany.universityapp_project.model;

public class Grade {
    
    // Instance variables
    private String gradeId;         // Grade ID
    private String studentId;       // Student ID
    private String examId;          // Exam ID
    private int grade;              // Grade 

    // Constructor for Grade class
    public Grade(String gradeId, String studentId, String examId, int grade) {
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.examId = examId;
        this.grade = grade;
    }

    // Getter & Setter for grade ID
    public String getGradeId() { return gradeId; }
    public void setGradeId(String gradeId) { this.gradeId = gradeId; }

    // Getter & Setter for student ID
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    // Getter & Setter for exam ID
    public String getExamId() { return examId; }
    public void setExamId(String examId) { this.examId = examId; }

    // Getter & Setter for grade
    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }

    // toString() method: displays the grade as a string
    @Override
    public String toString() {
        return "grade: [" + gradeId + ", " + studentId + ", " + examId + ", " + grade + "]";
    }
    
}