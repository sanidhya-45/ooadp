package ooadp.strategy;

public class Regular implements Pricing {

    @Override
    public double customerdiscount(double amount) {

       return 0.12* amount;
       }
    
}
