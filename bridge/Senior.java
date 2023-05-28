package ooadp.bridge;

public class Senior extends Customer {

     public Senior (Discount_interface d)
        {
            super(d);
        }
        
    @Override
    public double getprice(double price) {
        return d.cal_discount(price);

    }
}
