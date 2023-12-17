package com.mycompany.universityapp_project.model;

public class Subject {
    
    private String departmentId;
    private String subjectId;
    private String subjectName;
    private String professor;
    private int credits;

    public Subject(String departmentId, String subjectId, String subjectName, String professor, int credits) {
        this.departmentId = departmentId;
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.professor = professor;
        this.credits = credits;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }    
    
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    public String toString() {
        return "subject: [" + departmentId + ", " + subjectId + ", " + subjectName + ", " + professor + ", " + credits + "]";
    }  
    
}