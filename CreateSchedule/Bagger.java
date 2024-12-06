/*
 * Program: Bagger.java
 * Student: Lydia Frame 
 * Purpose: Subclass of EmployeeAbstract to represent a Bagger employee
*/

public class Bagger extends EmployeeAbstract {

    // Constructor to initialize a Bagger object with employee details
    public Bagger(String name, boolean isMinor, int startTime, int endTime, int breakTime) {
        super(name, isMinor, startTime, endTime, breakTime);  // Call the parent constructor to initialize common attributes
    }

    // Override the displayInfo method to return a formatted string of a Bagger's information
    @Override
    public String displayInfo() {
        // Return a string displaying the bagger's information
        return "Bagger: " + getName() 
                + " | Minor: " + getMinor() 
                + " | Start: " + getStartTime() 
                + " | End: " + getEndTime() 
                + " | Break: " + getBreakTime(); 
    }
}

