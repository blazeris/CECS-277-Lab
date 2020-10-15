/**
 * Lab6
 * Nathan Lai
 * Represents a single grade
 */
public class Grade {
    private char grade;

    /**
     * Default constructor
     */
    public Grade(){
        this('F');
    }

    /**
     * Arguments constructor
     * @param grade Letter grade
     */
    public Grade(char grade){
        this.grade = Character.toUpperCase(grade);
    }

    /**
     * @return Grade
     */
    public char getGrade() {
        return grade;
    }

    /**
     * Sets grade
     * @param grade New grade
     */
    public void setGrade(char grade) {
        this.grade = grade;
    }

    /**
     * Returns grade point of letter grade
     * @return Grade point of letter grade
     */
    double getPoint(){
        switch(grade){
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            default:
                return 0.0;
        }
    }

    /**
     * String representation of course
     * @return String representation of course
     */
    public String toString(){
        return Character.toString(grade);
    }
}
