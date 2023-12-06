package nov21;

public class Account {
    private String name; // instance variable (attribute)
    private double balance;

    /*
     * names of get and set
     * Get --> accessor
     * Set --> mutators
     * 
     * A constructor is a special method
     * every class must atleast have one constructor, even if not written
     * then java will add a default constructor
     */

    public Account(String theName) {
        if (theName != null)
            name = theName;
        else
            name = "Unknown";
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String theName) {
        if (theName != "")
            name = theName;
    }

    public void setBalance(double theBalance) {
        if (theBalance >= 0)
            balance = theBalance;
    }
}
