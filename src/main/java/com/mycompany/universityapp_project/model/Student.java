package com.mycompany.universityapp_project.model;

public class Student {
    
    private String studentId;
    private String departmentId;
    private String name;
    private String surname;
    private String address;
    private String phone;

    public Student(String studentId, String departmentId, String name, String surname, String address, String phone) {
        this.studentId = studentId;
        this.departmentId = departmentId;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    public String toString() {
        return "student: [" + studentId + ", " + departmentId + ", " + name + ", " + surname + ", " + address + ", " + phone + "]";
    }
}