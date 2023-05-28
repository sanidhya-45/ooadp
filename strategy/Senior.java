package ooadp.strategy;

public class Senior implements Pricing {

    @Override
    public double customerdiscount(double amount) {

       return 0.10* amount;
       }
    
}
