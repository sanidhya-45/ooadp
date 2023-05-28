package ooadp.strategy;

public class Store {
    private double storediscount;

    public Store( double d)
    {
        storediscount=d;
    }
    public double calculatestoredis(double amount)
    {
        if(amount>2000)
            return storediscount;
        return 0.0;
    }
}
