/*
 * Program: Main.java
 * Student: Lydia Frame 
 * Purpose: Program to manage employee scheduling (Baggers, Cashiers, and Managers)
*/

import java.util.Scanner; 
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Separate ArrayLists for each role: Baggers, Cashiers, Managers
        ArrayList<Bagger> baggers = new ArrayList<>();
        ArrayList<Cashier> cashiers = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>();

        // Input and add Baggers
        System.out.print("How many baggers would you like to schedule? ");
        int numBaggers = input.nextInt(); // Get number of baggers to schedule
        System.out.println();  // Print a blank line
        for (int i = 0; i < numBaggers; i++) {
            // Call createEmployee() method to create Bagger objects and add to list
            baggers.add((Bagger) createEmployee(input, "Bagger"));
            System.out.println();  // Add a blank line for readability
        }

        // Add space between sections
        System.out.println();

        // Input and add Cashiers
        System.out.print("How many cashiers would you like to schedule? ");
        int numCashiers = input.nextInt(); // Get number of cashiers to schedule
        System.out.println();  // Print a blank line
        for (int i = 0; i < numCashiers; i++) {
            // Call createEmployee() method to create Cashier objects and add to list
            cashiers.add((Cashier) createEmployee(input, "Cashier"));
            System.out.println();  // Add a blank line for readability
        }

        // Add space between sections
        System.out.println();

        // Input and add Managers
        System.out.print("How many managers would you like to schedule? ");
        int numManagers = input.nextInt(); // Get number of managers to schedule
        System.out.println();  // Print a blank line
        for (int i = 0; i < numManagers; i++) {
            // Call createEmployee() method to create Manager objects and add to list
            managers.add((Manager) createEmployee(input, "Manager"));
            System.out.println();  // Add a blank line for readability
        }

        // Display the schedule
        System.out.println("\n***Schedule***");
        // Print the number of baggers and their information
        System.out.println("\n* Baggers (" + baggers.size() + ") *");
        for (Bagger b : baggers) System.out.println(b.displayInfo());
        // Print the number of cashiers and their information
        System.out.println("\n* Cashiers (" + cashiers.size() + ") *");
        for (Cashier c : cashiers) System.out.println(c.displayInfo());
        // Print the number of managers and their information
        System.out.println("\n* Managers (" + managers.size() + ") *");
        for (Manager m : managers) System.out.println(m.displayInfo());

        // Close the Scanner object to prevent memory leaks
        input.close(); 

    }

    // Method to create and return an Employee object based on role
    public static EmployeeAbstract createEmployee(Scanner input, String role) {

        // Display a prompt to enter details for the employee
        System.out.println("Enter Details For " + role);
        input.nextLine();  // Consume any leftover newline character from previous input
    
        // Prompt for employee name
        System.out.print("Enter " + role + "'s Name: ");
        String name = input.nextLine();  // Get employee's name
    
        // Ask if the employee is a minor and handle invalid input
        boolean isMinor = false;
        while (true) {
            System.out.print("Is the employee a minor? (Y/N): ");
            String minorInput = input.nextLine().trim().toUpperCase();  // Get minor status input
            
            // Process valid inputs
            if (minorInput.equals("Y")) {
                isMinor = true;  // Employee is a minor
                break;
            }
            else if (minorInput.equals("N")) {
                isMinor = false;  // Employee is not a minor
                break;
            }
            else {
                // Handle invalid input
                System.out.println("Invalid input. Please enter Y for Yes or N for No.");
            }
        }
    
        // Prompt for work schedule times (military time)
        System.out.println("*Enter times in Military time*");
        System.out.print("Start time: ");
        int startTime = input.nextInt();  // Get start time
    
        input.nextLine();  // Consume newline after reading integer
    
        System.out.print("End time: ");
        int endTime = input.nextInt();  // Get end time
        input.nextLine();  // Consume newline after reading integer
    
        System.out.print("Break time: ");
        int breakTime = input.nextInt();  // Get break time
        
        // Create and return the appropriate employee object based on role
        if ("Bagger".equals(role)) {
            return new Bagger(name, isMinor, startTime, endTime, breakTime); 
        }
        else if ("Cashier".equals(role)) {
            return new Cashier(name, isMinor, startTime, endTime, breakTime);
        }
        else if ("Manager".equals(role)) {
            return new Manager(name, isMinor, startTime, endTime, breakTime);
        }
        else {
            return null;  // If the role doesn't match, return null
        }
    }
}
