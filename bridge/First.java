package ooadp.bridge;

public class First extends Customer {

    public First(Discount_interface d)
    {
        super(d);
    }
    @Override
    public double getprice(double price) {
        return d.cal_discount(price);
    }
    
}
