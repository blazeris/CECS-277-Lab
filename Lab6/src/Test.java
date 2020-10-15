import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<Course> courses = new ArrayList<>();
        Student jeff = new Student("Jeff");

        courses.add(new Course("Math", new Grade('A')));
        courses.add(new Course("English", new Grade('B')));
        courses.add(new Course("History", new Grade('A')));
        courses.add(new Course("Art", new Grade('C')));

        ReportCard rc = new ReportCard(jeff, courses);

        System.out.println(rc);
    }
}
