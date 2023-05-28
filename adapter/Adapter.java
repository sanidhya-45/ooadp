package ooadp.adapter;

public class Adapter implements Decathlontax {
    private Mauritax mau;
    public Adapter(Mauritax mau)
        {
            this.mau= mau;
        }
    
    public void hello(){System.out.println("hi");}
    @Override
    public double calculate(double amount) {
        return mau.getVat(amount);
    }
    
}
