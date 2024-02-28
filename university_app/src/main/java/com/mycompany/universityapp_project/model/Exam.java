package com.mycompany.universityapp_project.model;

public class Exam {
    
    private String examId;
    private String subjectId;
    private String examType;
    private String examDate;

    public Exam(String examId, String subjectId, String examType, String examDate) {
        this.examId = examId;
        this.subjectId = subjectId;
        this.examType = examType;
        this.examDate = examDate;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }
   
    @Override
    public String toString() {
        return "exam: [" + examId + ", " + subjectId + ", " + examType + ", " + examDate + "]";
    }
    
}