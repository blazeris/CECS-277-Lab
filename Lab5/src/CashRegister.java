/**
 A cash register totals up sales and computes change due.
 */

public class CashRegister {
    private double purchase;
    private double payment;

    /**
     Constructs a cash register with no money in it.
     */
    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    /**
     Records the purchase price of an item.
     @param amount the price of the purchased item
     */
    public void recordPurchase(double amount) {
        purchase += amount;
    }

    /**
     * Enters the payment received from the customer.
     * @param coinCount the number of coins received
     * @param coinType the type of coin that was received
     */
    public void receivePayment(int coinCount, Coin coinType){
        payment += coinCount * coinType.getValue();
    }

    /**
     Computes the change due and resets the machine for the next customer.
     @return the change due to the customer
     */
    public double giveChange() {
        double change = payment - purchase;
        // Round off to 2 decimal places  since adding doubles by itself comes up with strange trailing digits
        change = Math.round(change * 100.0) / 100.0;
        purchase = 0;
        payment = 0;
        return change;
    }
}