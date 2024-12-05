public class Manager extends EmployeeAbstract {

    public Manager(String name, boolean isMinor, int startTime, int endTime, int breakTime){
        super(name, isMinor, startTime, endTime, breakTime);
    }

    @Override
    public String displayInfo(){

        return "Manager: " + getName() 
                + " | Minor: " + getMinor() 
                + " | Start: " + getStartTime() 
                + " | End: " + getEndTime() 
                + " | Break: " + getBreakTime(); 
    }

}
