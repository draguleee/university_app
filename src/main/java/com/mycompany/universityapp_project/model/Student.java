package com.mycompany.universityapp_project.model;

public class Student {
    
    // Instance variables
    private String studentId;       // Student ID
    private String departmentId;    // Department ID
    private String name;            // Name
    private String surname;         // Surname
    private String address;         // Address 
    private String phone;           // Phone

    // Constructor for Student class
    public Student(String studentId, String departmentId, String name, String surname, String address, String phone) {
        this.studentId = studentId;
        this.departmentId = departmentId;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
    }

    // Getter & Setter for student ID
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    // Getter & Setter for department ID
    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }

    // Getter & Setter for name 
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Getter & Setter for surname
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    // Getter & Setter for address
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // Getter & Setter for phone number
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    
    // toString() method: displays the student as a string
    @Override
    public String toString() {
        return "student: [" + studentId + ", " + departmentId + ", " + name + ", " + surname + ", " + address + ", " + phone + "]";
    }
}