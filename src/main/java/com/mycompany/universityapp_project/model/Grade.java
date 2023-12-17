package com.mycompany.universityapp_project.model;

public class Grade {
    
    private String gradeId;
    private String studentId;
    private String examId;
    private int grade;

    public Grade(String gradeId, String studentId, String examId, int grade) {
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.examId = examId;
        this.grade = grade;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString() {
        return "grade: [" + gradeId + ", " + studentId + ", " + examId + ", " + grade + "]";
    }
    
}