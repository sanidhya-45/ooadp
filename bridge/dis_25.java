package ooadp.bridge;

// concrete implementations of Discount_interface
public class dis_25 implements Discount_interface{
    
    public double cal_discount(double amount)
    {
        return amount*0.25;
    }
}
