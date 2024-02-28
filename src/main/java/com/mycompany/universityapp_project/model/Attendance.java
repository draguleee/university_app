package com.mycompany.universityapp_project.model;

public class Attendance {
    
    // Instance variables
    private String attendanceId;        // Attendance ID
    private String studentId;           // Student ID
    private String subjectId;           // Subject ID
    private int attendances;            // Number of attendances

    // Constructor for Attendance class
    public Attendance(String attendanceId, String studentId, String subjectId, int attendances) {
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.attendances = attendances;
    }

    // Getter & Setter for attendance ID
    public String getAttendanceId() { return attendanceId; }
    public void setAttendanceId(String attendanceId) { this.attendanceId = attendanceId; }

    // Getter & Setter for student ID
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    // Getter & Setter for subject ID
    public String getSubjectId() { return subjectId; }
    public void setSubjectId(String subjectId) { this.subjectId = subjectId; }

    // Getter & Setter for the number of attendances
    public int getAttendances() { return attendances; }
    public void setAttendances(int attendances) { this.attendances = attendances; }
    
    // toString() method: displays the attendance as a string 
    @Override
    public String toString() {
        return "attendance: [" + attendanceId + ", " + studentId + ", " + subjectId + ", " + attendances + "]";
    }
    
}