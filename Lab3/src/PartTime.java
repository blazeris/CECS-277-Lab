/**
 * Team 16
 * Githel Lynn Suico
 * Nathan Lai
 * Represents a part time staff member
 */
public class PartTime extends Staff {
    private int hoursWorked;

    /**
     * Default constructor
     */
    public PartTime(){
        super();
        this.hoursWorked = 0;
    }

    /**
     * Arguments constructor
     * @param lastName Last name of employee
     * @param firstName First name of employee
     * @param ID ID of employee
     * @param hoursWorked Number of hours worked by employee
     */
    public PartTime(String lastName, String firstName, String ID, double hourlyRate,int hoursWorked){
        super(lastName, firstName, ID, hourlyRate);
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


    /**
     * @return Summary of part timers's details
     */
    @Override
    public String toString(){
        String description = super.toString();
        description += "\nHourly rate: " + getHourlyRate() +
                        "\nHours worked per week: " + getHoursWorked();
        return description;
    }
}
