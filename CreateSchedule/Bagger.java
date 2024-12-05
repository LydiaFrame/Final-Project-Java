public class Bagger extends EmployeeAbstract {

    public Bagger(String name, boolean isMinor, int startTime, int endTime, int breakTime){
        super(name, isMinor, startTime, endTime, breakTime);
    }

    @Override
    public String displayInfo(){

        return "Bagger: " + getName() 
                + " | Minor: " + getMinor() 
                + " | Start: " + getStartTime() 
                + " | End: " + getEndTime() 
                + " | Break: " + getBreakTime(); 
    }

}
