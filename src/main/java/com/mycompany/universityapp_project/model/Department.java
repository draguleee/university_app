package com.mycompany.universityapp_project.model;

public class Department {
    
    // Instance variables
    private String departmentId;        // Department ID
    private String departmentName;      // Department name
    private int years;                  // Years of study
    private String type;                // Type of department 

    // Constructor for Department class
    public Department(String departmentId, String departmentName, int years, String type) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.years = years;
        this.type = type;
    }

    // Getter & Setter for department ID
    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }
   
    // Getter & Setter for department name
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    // Getter & Setter for number of years of study
    public int getYears() { return years; }
    public void setYears(int years) { this.years = years; }

    // Getter & Setter for the department type
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    
    // toString() method: displays the department as a string
    @Override
    public String toString() {
        return "department: [" + departmentName + ", " + years + ", " + type + "]";
    }
    
}
