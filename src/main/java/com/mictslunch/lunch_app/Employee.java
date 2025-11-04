package com.mictslunch.lunch_app;

public class Employee {
    private String name;
    private String mondayLunch;
    private String tuesdayLunch;
    private String wednesdayLunch;
    private String thursdayLunch;
    private String fridayLunch;

    public Employee(String name, String mondayLunch, String tuesdayLunch, String wednesdayLunch, String thursdayLunch, String fridayLunch) {
        this.name = name;
        this.mondayLunch = mondayLunch;
        this.tuesdayLunch = tuesdayLunch;
        this.wednesdayLunch = wednesdayLunch;
        this.thursdayLunch = thursdayLunch;
        this.fridayLunch = fridayLunch;
    }

    // Getters
    public String getName() { return name; }
    public String getMondayLunch() { return mondayLunch; }
    public String getTuesdayLunch() { return tuesdayLunch; }
    public String getWednesdayLunch() { return wednesdayLunch; }
    public String getThursdayLunch() { return thursdayLunch; }
    public String getFridayLunch() { return fridayLunch; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setMondayLunch(String mondayLunch) { this.mondayLunch = mondayLunch; }
    public void setTuesdayLunch(String tuesdayLunch) { this.tuesdayLunch = tuesdayLunch; }
    public void setWednesdayLunch(String wednesdayLunch) { this.wednesdayLunch = wednesdayLunch; }
    public void setThursdayLunch(String thursdayLunch) { this.thursdayLunch = thursdayLunch; }
    public void setFridayLunch(String fridayLunch) { this.fridayLunch = fridayLunch; }
}