import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        //Testing Staff class
        Staff allen = new Staff("Allen", "Paita", "123", 50.00);
        Staff zapata = new Staff("Zapata", "Steven", "456", 35.00);
        Staff rios = new Staff("Rios", "Enrique", "789", 40.00);

        System.out.println(allen + "\n");
        System.out.println(zapata + "\n");
        System.out.println(rios + "\n");
        System.out.println("\n\n");

        //Testing Faculty class
        Faculty johnson = new Faculty("Johnson", "Anne", "243", "Ph.D", Faculty.Level.FU, "Engineering", 3);
        Faculty bouris = new Faculty("Bouris", "William", "791", "Ph.D", Faculty.Level.AS, "English", 1);
        Faculty andrade = new Faculty("Andrade", "Christopher", "623", "MS", Faculty.Level.AS, "Physical Education", 0);

        System.out.println(johnson + "\n");
        System.out.println(bouris + "\n");
        System.out.println(andrade + "\n");
        System.out.println("\n\n");

        //Testing PartTime class
        PartTime guzman = new PartTime("Guzman", "Augusto", "455", 35.0, 30);
        PartTime depirro = new PartTime("Depirro", "Martin", "678", 30.0, 15);
        PartTime aldaco = new PartTime("Aldaco", "Marque", "945", 20.0, 35);

        System.out.println(guzman + "\n");
        System.out.println(depirro + "\n");
        System.out.println(aldaco + "\n");
        System.out.println("\n\n");

        // Testing total monthly salary for all part-time staff
        ArrayList<Employee> partTimers = new ArrayList<>();
        partTimers.add(guzman);
        partTimers.add(depirro);
        partTimers.add(aldaco);
        System.out.println("Total monthly salary of part-time: $" + totalEarnings(partTimers));

        // Testing total monthly salary for all employees
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(guzman);
        employees.add(depirro);
        employees.add(aldaco);
        employees.add(allen);
        employees.add(zapata);
        employees.add(rios);
        employees.add(johnson);
        employees.add(bouris);
        employees.add(andrade);
        System.out.println("Total monthly salary of employee: $" + totalEarnings(employees));
    }

    public static double totalEarnings(ArrayList<Employee> employees){
        double sum = 0;
        for(Employee employee: employees){
            sum += employee.monthlyEarning();
        }
        return sum;
    }
}
