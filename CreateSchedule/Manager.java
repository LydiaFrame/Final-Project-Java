/*
 * Program: Manager.java
 * Student: Lydia Frame 
 * Purpose: Subclass of EmployeeAbstract to represent a Manager employee
*/

public class Manager extends EmployeeAbstract {

    // Constructor to initialize a Manager object with employee details
    public Manager(String name, boolean isMinor, int startTime, int endTime, int breakTime) {
        super(name, isMinor, startTime, endTime, breakTime);  // Call the parent constructor to initialize common attributes
    }

    // Override the displayInfo method to return a formatted string of a Manager's information
    @Override
    public String displayInfo() {
        // Return a string displaying the manager's information
        return "Manager: " + getName() 
                + " | Minor: " + getMinor() 
                + " | Start: " + getStartTime() 
                + " | End: " + getEndTime() 
                + " | Break: " + getBreakTime(); 
    }
}
