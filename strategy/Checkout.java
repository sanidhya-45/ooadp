package ooadp.strategy;

public class Checkout {
    private Pricing p;
    private Store st;

    public Checkout(Pricing p, Store st)
    {
        this.p=p;
        this.st=st;
    }
     public void setPricing(Pricing p)
     {
        this.p=p;
     }
     public double totalpayment(double amount)
     {
        double customerdiscount= p.customerdiscount(amount);
        double each_day_discount= st.calculatestoredis(amount);

        return amount- customerdiscount -each_day_discount;
     }
}
