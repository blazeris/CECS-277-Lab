public class Main {
    public static void main(String[] args){
        //Testing Staff class
        Staff allen = new Staff("Allen", "Paita", "123", 50.00);
        Staff zapata = new Staff("Zapata", "Steven", "456", 35.00);
        Staff rios = new Staff("Rios", "Enrique", "789", 40.00);

        System.out.println(allen);
        System.out.println(zapata);
        System.out.println(rios);
        System.out.println();
        //Testing Faculty class
        Faculty johnson = new Faculty("Johnson", "Anne", "243", "Ph.D", Faculty.Level.FU, "Engineering", 3);
        Faculty bouris = new Faculty("Bouris", "William", "791", "Ph.D", Faculty.Level.AS, "English", 1);
        Faculty andrade = new Faculty("Andrade", "Christopher", "623", "MS", Faculty.Level.AS, "Physical Education", 0);

        System.out.println(johnson);
        System.out.println(bouris);
        System.out.println(andrade);
        System.out.println();

        //Testing PartTime class
        PartTime guzman = new PartTime("Guzman", "Augusto", "455", 35.0, 30);
        PartTime depirro = new PartTime("Depirro", "Martin", "678", 30.0, 15);
        PartTime aldaco = new PartTime("Aldaco", "Marque", "945", 20.0, 35);

        System.out.println(guzman);
        System.out.println(bouris);
        System.out.println(andrade);
        System.out.println();
    }
}
