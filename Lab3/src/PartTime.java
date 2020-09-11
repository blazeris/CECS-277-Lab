public class PartTime extends Staff {
    private int hoursWorked;

    /**
     * Default constructor
     */
    public PartTime(){
        super();
    }

    /**
     * Arguments constructor
     * @param lastName Last name of employee
     * @param firstName First name of employee
     * @param ID ID of employee
     * @param hoursWorked Number of hours worked by employee
     */
    public PartTime(String lastName, String firstName, String ID, int hoursWorked){
        super(lastName, firstName, ID);
        this.hoursWorked = hoursWorked;
    }

    /**
     * @return Number of hours worked by employee
     */
    public int getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked Number of hours that employee will work
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * Returns the monthly earnings, which is hourly rate multiplied by hours worked in 4 weeks
     * @return monthly earnings
     */
    public double monthlyEarning(){
        return getHourlyRate() * hoursWorked;
    }
}
