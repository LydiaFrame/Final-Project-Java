/*
 * Program: EmployeeAbstract.java
 * Student: Lydia Frame 
 * Purpose: Abstract class for employee management, to be extended by specific employee roles
*/

public abstract class EmployeeAbstract {

    // Instance variables for employee's details
    private String name;         // Employee's name
    private boolean isMinor;     // Whether the employee is a minor
    private int startTime;       // Employee's start time (in military time)
    private int endTime;         // Employee's end time (in military time)
    private int breakTime;       // Employee's break time (in minutes)

    // Constructor to initialize the employee's attributes
    EmployeeAbstract(String name, boolean isMinor, int startTime, int endTime, int breakTime) {
        this.name = name;          // Initialize name
        this.isMinor = isMinor;    // Initialize minor status
        this.startTime = startTime;  // Initialize start time
        this.endTime = endTime;    // Initialize end time
        this.breakTime = breakTime;  // Initialize break time
    }

    // Setter methods to update employee details
    public void setName(String name) { this.name = name; }            // Set employee's name
    public void setIsMinor(boolean isMinor) { this.isMinor = isMinor; } // Set minor status
    public void setStartTime(int startTime) { this.startTime = startTime; }  // Set start time
    public void setEndTime(int endTime) { this.endTime = endTime; }    // Set end time
    public void setBreakTime(int breakTime) { this.breakTime = breakTime; }  // Set break time

    // Getter methods to retrieve employee details
    public String getName() { return name; }            // Get employee's name
    public String getMinor() { return isMinor ? "Yes" : "No"; }  // Get minor status as "Yes" or "No"
    public int getStartTime() { return startTime; }     // Get start time
    public int getEndTime() { return endTime; }         // Get end time
    public int getBreakTime() { return breakTime; }     // Get break time

    // Abstract method for displaying employee's information (to be implemented in subclasses)
    public abstract String displayInfo();  // Display employee information (to be defined in subclass)
}