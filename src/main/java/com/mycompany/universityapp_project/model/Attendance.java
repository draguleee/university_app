package com.mycompany.universityapp_project.model;

public class Attendance {
    
    private String attendanceId;
    private String studentId;
    private String subjectId;
    private int attendances;

    public Attendance(String attendanceId, String studentId, String subjectId, int attendances) {
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.attendances = attendances;
    }

    public String getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public int getAttendances() {
        return attendances;
    }

    public void setAttendances(int attendances) {
        this.attendances = attendances;
    }
    
    public String toString() {
        return "attendance: [" + attendanceId + ", " + studentId + ", " + subjectId + ", " + attendances + "]";
    }
}