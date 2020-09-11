public class Faculty extends Employee {
    private enum Level {
        AS, AO, FU
    }
    private Education education;

    public Faculty(){
        super();
        education = new Education();
    }

    public Faculty(String lastName, String firstName, String ID){
        super(lastName, firstName, ID);
        education = new Education();
    }

    public Faculty(String lastName, String firstName, String ID, String degree, String major, int research){
        super(lastName, firstName, ID);
        education = new Education(degree, major, research);
    }

}
