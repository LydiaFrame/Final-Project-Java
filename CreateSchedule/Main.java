/*
 * Program: Main.java
 * Student: Lydia Frame 
 * Purpose: 
*/

import java.util.Scanner; 
import java.util.ArrayList;


public class Main {
		
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
		Scanner input = new Scanner(System.in);

        //separate ArrayLists for each role
        ArrayList<Bagger> baggers = new ArrayList<>();
        ArrayList<Cashier> cashiers = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>();

        //Input and add Baggers
        System.out.print("How many baggers would you like to schedule? ");
        int numBaggers = input.nextInt();
        for (int i = 0; i < numBaggers; i++) {
            baggers.add((Bagger) createEmployee(input, "Bagger"));
        }

        // Input and add Cashiers
        System.out.print("How many cashiers would you like to schedule? ");
        int numCashiers = input.nextInt();
        for (int i = 0; i < numCashiers; i++) {
            cashiers.add((Cashier) createEmployee(input, "Cashier"));
        }

        // Input and add Managers
        System.out.print("How many managers would you like to schedule? ");
        int numManagers = input.nextInt();
        for (int i = 0; i < numManagers; i++) {
            managers.add((Manager) createEmployee(input, "Manager"));
        }

        // Display the schedule
        System.out.println("\nSchedule:");
        System.out.println("Baggers:");
        for (Bagger b : baggers) System.out.println(b.displayInfo());
        System.out.println("\nCashiers:");
        for (Cashier c : cashiers) System.out.println(c.displayInfo());
        System.out.println("\nManagers:");
        for (Manager m : managers) System.out.println(m.displayInfo());

        input.close(); 

    }

    public static EmployeeAbstract createEmployee(Scanner input, String role) {

        System.out.println("Enter details for " + role + ".");
        input.nextLine();
    
        System.out.print("Enter " + role + "'s Name: ");
        String name = input.nextLine(); 
    
        boolean isMinor = false;
        while (true) {
            System.out.print("Is the employee a minor? (Y/N): ");
            String minorInput = input.nextLine().trim().toUpperCase();
            
            if (minorInput.equals("Y")) {
                isMinor = true;
                break;
            }
            else if (minorInput.equals("N")) {
                isMinor = false;
                break;
            }
            else {
                System.out.println("Invalid input. Please enter Y for Yes or N for No.");
            }
            
        }
    
        System.out.println("*Enter times in Military time*");
        System.out.print("Start time: ");
        int startTime = input.nextInt();
    
        System.out.print("End time: ");
        int endTime = input.nextInt();
    
        System.out.print("Break time: ");
        int breakTime = input.nextInt();
        input.nextLine();
    
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
            return null;
        }
    }
}

/* public static EmployeeAbstract createEmployee(Scanner input, String role) { 

    System.out.println("Enter details for " + role + ".");
    input.nextLine();

    System.out.print("Enter " + role + "'s Name: ");
    String name = input.nextLine(); 

    boolean isMinor = false;
    while (true) {
        System.out.print("Is the employee a minor? (Y/N): ");
        String minorInput = input.nextLine().trim().toUpperCase();
        
        if (minorInput.equals("Y")) {
            isMinor = true;
            break;
        }
        else if (minorInput.equals("N")) {
            isMinor = false;
            break;
        }
        else {
            System.out.println("Invalid input. Please enter Y for Yes or N for No.");
        }
        
    }

    System.out.println("*Enter times in Military time*");
    System.out.print("Start time: ");
    int startTime = input.nextInt();

    System.out.print("End time: ");
    int endTime = input.nextInt();

    System.out.print("Break time: ");
    int breakTime = input.nextInt();
    input.nextLine();

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
        return null;
    }
} */