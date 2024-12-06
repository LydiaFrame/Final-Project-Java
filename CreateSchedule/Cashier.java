/*
 * Program: Cashier.java
 * Student: Lydia Frame 
 * Purpose: Subclass of EmployeeAbstract to represent a Cashier employee
*/

public class Cashier extends EmployeeAbstract {

    // Constructor to initialize a Cashier object with employee details
    public Cashier(String name, boolean isMinor, int startTime, int endTime, int breakTime) {
        super(name, isMinor, startTime, endTime, breakTime);  // Call the parent constructor to initialize common attributes
    }

    // Override the displayInfo method to return a formatted string of a Cashier's information
    @Override
    public String displayInfo() {
        // Return a string displaying the cashier's information
        return "Cashier: " + getName() 
                + " | Minor: " + getMinor() 
                + " | Start: " + getStartTime() 
                + " | End: " + getEndTime() 
                + " | Break: " + getBreakTime(); 
    }
}

