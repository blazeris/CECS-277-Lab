/**
 * Team 16
 * Githel Lynn Suico
 * Nathan Lai
 * Faculty class is child of employee, represents a faculty member
 */
public class Faculty extends Employee {
    public enum Level {
        AS, AO, FU
    }
    private Level facultyLevel;

    private Education education;

    /**
     * Default constructor
     */
    public Faculty(){
        super();
        this.facultyLevel = null;
        education = new Education();
    }

    /**
     * Arguments except education constructor
     * @param lastName Last name of faculty
     * @param firstName First name of faculty
     * @param ID ID of faculty
     * @param facultyLevel Level of faculty
     */
    public Faculty(String lastName, String firstName, String ID, Level facultyLevel){
        super(lastName, firstName, ID);
        this.facultyLevel = facultyLevel;
        education = new Education();
    }

    /**
     * Full arguments constructor
     * @param lastName Last name of faculty
     * @param firstName First name of faculty
     * @param ID ID of faculty
     * @param facultyLevel Level of faculty
     * @param major Major of faculty
     * @param research Number of researches done by faculty
     */
    public Faculty(String lastName, String firstName, String ID, String degree, Level facultyLevel, String major, int research){
        super(lastName, firstName, ID);
        this.facultyLevel = facultyLevel;
        education = new Education(degree, major, research);
    }

    /**
     * Calculates amount of money earned per month depending on faculty level
     * @return Amount of money earned in a month
     */
    public double monthlyEarning(){
        double earnings = 0;
        switch(facultyLevel){
            case AS:
                earnings = FACULTY_MONTHLY_SALARY;
                break;
            case AO:
                earnings = 1.5 * FACULTY_MONTHLY_SALARY;
                break;
            case FU:
                earnings = 2 * FACULTY_MONTHLY_SALARY;
                break;
        }
        return earnings;
    }

    /**
     * @return Summary of faculty's details
     */
    @Override
    public String toString(){
        String description = super.toString();
        switch(facultyLevel){
            case AS:
                description += "\nLevel: Assistant";
                break;
            case AO:
                description += "\nLevel: Associate";
                break;
            case FU:
                description += "\nLevel: Full";
                break;
        }
        description += "\nDegree: " + education.getDegree() +
                        "\nMajor: " + education.getMajor() +
                        "\nResearch: " + education.getResearch();
        return description;
    }
}
