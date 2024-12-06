# Final-Project-Java
OOP Final Project
 
Employee Scheduling System

Overview
This program is a simple employee scheduling system that allows users to create and manage schedules for different types of employees: Baggers, Cashiers, and Managers. The user can input details for each employee, including their name, minor status, work hours, and break time. The system will display a schedule listing the details of each employee in their respective roles.

Features
Allows the creation of multiple Baggers, Cashiers, and Managers.
Prompts the user for employee details such as:
Name
Minor status (Yes/No)
Start time, end time, and break time (in military time)
Displays the scheduled employees in a formatted schedule.
Allows flexibility to schedule employees by role (Bagger, Cashier, or Manager).
Classes
Main: Contains the main method and logic for inputting employee data and displaying the final schedule.
EmployeeAbstract: An abstract class that defines common properties and methods for all employee types (name, minor status, start time, end time, break time).
Bagger: A subclass of EmployeeAbstract that represents a Bagger employee.
Cashier: A subclass of EmployeeAbstract that represents a Cashier employee.
Manager: A subclass of EmployeeAbstract that represents a Manager employee.
How to Run
Clone or download the repository.
Compile and run the Main.java file.
Follow the prompts to enter details for Baggers, Cashiers, and Managers.
View the generated schedule for all employees.

Example Output

How many baggers would you like to schedule? 2

Enter Details For Bagger
Enter Bagger's Name: John
Is the employee a minor? (Y/N): N
*Enter times in Military time*
Start time: 800
End time: 1700
Break time: 30

Enter Details For Bagger
Enter Bagger's Name: Sarah
Is the employee a minor? (Y/N): Y
*Enter times in Military time*
Start time: 900
End time: 1800
Break time: 30

...

***Schedule***

* Baggers (2) *
Bagger: John | Minor: No | Start: 800 | End: 1700 | Break: 30
Bagger: Sarah | Minor: Yes | Start: 900 | End: 1800 | Break: 30

* Cashiers (0) *
* Managers (0) *

Contributing
If you want to contribute to this project, feel free to fork the repository and submit a pull request. All contributions are welcome!

License
This project is licensed under the MIT License - see the LICENSE file for details.


