public abstract class EmployeeAbstract {

    private String name;
    private boolean isMinor;
    private int startTime;
    private int endTime;
    private int breakTime; 

    EmployeeAbstract (String name, boolean isMinor, int startTime, int endTime, int breakTime) {
        this.name = name;
        this.isMinor = isMinor;
        this.startTime = startTime;
        this.endTime = endTime;
        this.breakTime = breakTime;
    }

    //getters and setter methods 
    public void setName(String name) {this.name = name;}
    public void setIsMinor(boolean isMinor){ this.isMinor = isMinor;}
    public void setStartTime(int startTime) { this.startTime = startTime; }
    public void setEndTime(int endTime) { this.endTime = endTime; }
    public void setBreakTime(int breakTime) { this.breakTime = breakTime; }

    public String getName() {return name;}
    public String getMinor() { return isMinor? "Yes" : "No"; }
    public int getStartTime() { return startTime; }
    public int getEndTime() { return endTime; }
    public int getBreakTime() { return breakTime; }

    public abstract String displayInfo(); 

}
