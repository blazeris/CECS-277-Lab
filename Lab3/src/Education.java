/**
 * Team 16
 * Githel Lynn Suico
 * Nathan Lai
 * Stores information about an employee's education
 */
public class Education {
    private String degree;
    private String major;
    private int research;

    /**
     * Default constructor
     */
    public Education(){
        degree = "No Degree";
        major = "Undeclared";
        research = 0;
    }

    /**
     * Arguments constructor
     * @param degree is MS or PhD
     * @param major is the major
     * @param research is the number of researches
     */
    public Education(String degree, String major, int research){
        this.degree = degree;
        this.major = major;
        this.research = research;
    }

    /**
     * @return Degree owned
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @return Current major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @return Number of research projects participated in
     */
    public int getResearch() {
        return research;
    }

    /**
     * @param degree Degree to set to
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * @param major College major to set to
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @param research Number of research projects to set to
     */
    public void setResearch(int research) {
        this.research = research;
    }
}
