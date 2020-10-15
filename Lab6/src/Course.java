/**
 * Lab6
 * Nathan Lai
 * Represents a class and grade in class
 */
public class Course {
    private String courseName;
    private Grade grade;

    /**
     * Default constructor
     */
    public Course(){
        this("", new Grade());
    }

    /**
     * Arguments constructor
     * @param coursename Name of course
     * @param grade Grade of course
     */
    public Course(String coursename, Grade grade){
        this.courseName = coursename;
        this.grade = grade;
    }

    /**
     * @return Grade
     */
    public Grade getGrade(){
        return grade;
    }

    /**
     * String representation of course
     * @return String representation of course
     */
    public String toString(){
        return String.format("%-45s%5s", courseName, grade);
    }
}
