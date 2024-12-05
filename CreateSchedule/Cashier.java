public class Cashier extends EmployeeAbstract {

    public Cashier(String name, boolean isMinor, int startTime, int endTime, int breakTime){
        super(name, isMinor, startTime, endTime, breakTime);
    }

    @Override
    public String displayInfo(){

        return "Cashier: " + getName() 
                + " | Minor: " + getMinor() 
                + " | Start: " + getStartTime() 
                + " | End: " + getEndTime() 
                + " | Break: " + getBreakTime(); 
    }

}
