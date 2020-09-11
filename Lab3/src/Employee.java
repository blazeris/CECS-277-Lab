/**
 * Employee class meant to be the parent for all staff and faculty types in the school
 */
public abstract class Employee {
    private String lastName;
    private String firstName;
    private String ID;

    /**
     * Default constructor
     */
    public Employee(){
    }

    /**
     * Argument constructor
     * @param lastName is the last name
     * @param firstName is the first name
     * @param ID is the employee number
     */
    public Employee(String lastName, String firstName, String ID){
        this.lastName = lastName;
        this.firstName = firstName;
        this.ID = ID;
    }

    /**
     * @return Summary of employee's details
     */
    @Override
    public String toString(){
        return "ID Employee number : " + ID + "\nEmployee name: " + firstName + " " + lastName;
    }

    /**
     * @return Last name of employee
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * @return First name of employee
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * @return Employee ID of employee
     */
    public String getID(){
        return ID;
    }

    /**
     * @param lastName Last name to set to employee
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param firstName First name to set to employee
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * @param ID ID to set to employee
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    abstract public double monthlyEarning();
}