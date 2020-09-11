public class Staff extends Employee {
    private double hourlyRate;

    /**
     * Default constructor
     */
    public Staff(){
        super();
    }

    /**
     * Arguments constructor
     * @param lastName is last name of the staff member
     * @param firstName is first name of the staff member
     * @param ID is the employee identification number
     */
    public Staff(String lastName, String firstName, String ID){
        super(lastName, firstName, ID);
    }


    /**
     * @return The hourly rate the staff is paid
     */
    public double getHourlyRate() {
        return hourlyRate;
    }


    /**
     * @param hourlyRate The hourly rate to set to the staff
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return Monthly earnings, hourly rate times full time hours (160)
     */
    public double monthlyEarning(){
        return hourlyRate * 160;
    }

    /**
     * @return Summary of staff's details
     */
    @Override
    public String toString(){
        return super.toString() + "\nFull Time \nMonthly Salary: $" + hourlyRate;
    }
}
