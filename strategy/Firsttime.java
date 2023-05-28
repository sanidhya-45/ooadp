package ooadp.strategy;

public class Firsttime implements Pricing {

    @Override
    public double customerdiscount(double amount) {

       return 0.15* amount;
       }
    
}
