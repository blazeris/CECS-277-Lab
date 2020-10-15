/**
 * Lab6
 * Nathan Lai
 * Represents a student
 */
public class Student {
    String name;

    /**
     * Default constructor
     */
    public Student(){
        this("");
    }

    /**
     * Arguments constructor
     * @param name Full name of the student
     */
    public Student(String name){
        this.name = name;
    }

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name
     * @param name Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * String representation of Student
     * @return Name of student
     */
    @Override
    public String toString() {
        return name;
    }
}
