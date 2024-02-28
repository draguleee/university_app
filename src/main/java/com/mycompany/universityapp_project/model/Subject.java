package com.mycompany.universityapp_project.model;

public class Subject {
    
    // Instance variables
    private String departmentId;        // Department ID
    private String subjectId;           // Subject ID
    private String subjectName;         // Subject name
    private String professor;           // Professor
    private int credits;                // Credits

    // Constructor for Subject class
    public Subject(String departmentId, String subjectId, String subjectName, String professor, int credits) {
        this.departmentId = departmentId;
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.professor = professor;
        this.credits = credits;
    }

    // Getter & Setter for department ID
    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }

    // Getter & Setter for subject ID
    public String getSubjectId() { return subjectId; }
    public void setSubjectId(String subjectId) { this.subjectId = subjectId; }    
    
    // Getter & Setter for subject name
    public String getSubjectName() { return subjectName; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }

    // Getter & Setter for professor
    public String getProfessor() { return professor; }
    public void setProfessor(String professor) { this.professor = professor; }

    // Getter & Setter for the number of credits
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
    
    // toString() method: displays the subject as a string
    @Override
    public String toString() {
        return "subject: [" + departmentId + ", " + subjectId + ", " + subjectName + ", " + professor + ", " + credits + "]";
    }  
    
}