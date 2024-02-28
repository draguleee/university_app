package com.mycompany.universityapp_project.model;

public class Department {
    
    private String departmentId;
    private String departmentName;
    private int years;
    private String type;

    public Department(String departmentId, String departmentName, int years, String type) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.years = years;
        this.type = type;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
   
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String toString() {
        return "department: [" + departmentName + ", " + years + ", " + type + "]";
    }
}
