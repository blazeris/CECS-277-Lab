import java.util.ArrayList;

/**
 * Lab6
 * Nathan Lai
 * Represents a report card of a student
 */
public class ReportCard {
    private Student student;
    private ArrayList<Course> courses;

    /**
     * Default constructor
     */
    public ReportCard(){
        this(new Student(), new ArrayList<Course>());
    }

    /**
     * Single argument constructor
     * @param student Student that owns report card
     */
    public ReportCard(Student student){
        this(student, new ArrayList<Course>());
    }

    /**
     * Full arguments constructor
     * @param student Student that owns report card
     * @param courses List of courses that student is taking
     */
    public ReportCard(Student student, ArrayList<Course> courses){
        this.student = student;
        this.courses = courses;
    }

    /**
     * @return Student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @return List of courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }


    /**
     * Calculates GPA of all courses
     * @return GPA of all courses
     */
    double calculateGpa(){
        double gradePoints = 0;
        for(Course c: courses){
            gradePoints += c.getGrade().getPoint();
        }
        return gradePoints / courses.size();
    }

    /**
     * String representation of ReportCard
     * @return Formatted report card
     */
    @Override
    public String toString(){
        String card = String.format("%20s's Report Card\n", student);
        for(Course c: courses){
            card += String.format("%s\n", c);
        }
        card += String.format("\n%-45s%5s", "GPA: ", calculateGpa());
        return card;

    }
}
