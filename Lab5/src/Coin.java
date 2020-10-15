/**
 * Lab 5
 * Nathan Lai
 * Coin serves as a representation of a denomination of a currency, ie quarter
 */
public class Coin {
    private double value;
    private String name;

    /**
     * Default constructor
     */
    public Coin(){
        this(0, "");
    }

    /**
     * Arguments constructor
     * @param value is worth of coin type
     * @param name is name of coin type
     */
    public Coin(double value, String name){
        this.value = value;
        this.name = name;
    }

    /**
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }
}
