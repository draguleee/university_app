package com.mycompany.universityapp_project.model;

public class Exam {
    
    // Instance variables
    private String examId;          // Exam ID
    private String subjectId;       // Subject ID
    private String examType;        // Exam type
    private String examDate;        // Exam date

    // Constructor for Exam class
    public Exam(String examId, String subjectId, String examType, String examDate) {
        this.examId = examId;
        this.subjectId = subjectId;
        this.examType = examType;
        this.examDate = examDate;
    }

    // Getter & Setter for exam ID
    public String getExamId() { return examId; }
    public void setExamId(String examId) { this.examId = examId; }

    // Getter & Setter for subject ID
    public String getSubjectId() { return subjectId; }
    public void setSubjectId(String subjectId) { this.subjectId = subjectId; }

    // Getter & Setter for exam type
    public String getExamType() { return examType; }
    public void setExamType(String examType) { this.examType = examType; }

    // Getter & Setter for exam date
    public String getExamDate() { return examDate; }
    public void setExamDate(String examDate) { this.examDate = examDate; }
   
    // toString() method: displays the exam as a string
    @Override
    public String toString() {
        return "exam: [" + examId + ", " + subjectId + ", " + examType + ", " + examDate + "]";
    }
    
}