package ooadp.bridge;

public abstract class Customer {

    // to make bridge
    protected Discount_interface d;

    public Customer(Discount_interface d)
    {
        this.d=d;
    }

    public abstract double getprice(double price);
    
}
