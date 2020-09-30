import java.util.Comparator;

public class LastNameComparator implements Comparator {
    /**
     * Compares two objects's last names, treating them as Employee objects
     * Sorts Employees by last name in descending order
     * @param o1 Object 1
     * @param o2 Object 2
     * @return Comparison value between last names
     */
    @Override
    public int compare(Object o1, Object o2){
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;

        return -1 * e1.getLastName().compareTo(e2.getLastName());
    }
}