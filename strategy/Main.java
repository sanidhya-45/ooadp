package ooadp.strategy;

public class Main {
    public static void main(String[] args)
    {
        Store st= new Store(100);
        Pricing reg= new Regular();
        Pricing sen= new Senior();
        Pricing ft= new Firsttime();

        // for regular customer
        Checkout ch= new Checkout(reg, st);
        double total_for_regular=ch.totalpayment(2500);
        System.out.println(total_for_regular);

        // for Senior citizen 
        Checkout ch1 = new Checkout(sen, st);
        double total_for_senior=ch1.totalpayment(2500);
        System.out.println(total_for_senior);

        // for first time customer
        Checkout ch2= new Checkout(ft, st);
        double total_for_first=ch2.totalpayment(2500);
        System.out.println(total_for_first);

        
        
    }
}
