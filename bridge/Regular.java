package ooadp.bridge;

public class Regular  extends Customer{

    public Regular(Discount_interface d) {
        super(d);

    }

    @Override
    public double getprice(double price) {
        return d.cal_discount(price);
    }
    
    
}
