package ooadp.bridge;

public class Main {
    public static void main(String[] args)
    {
        double amount_to_pay;

        Customer sen = new Senior(new dis_20());
        amount_to_pay= sen.getprice(2500);
        System.out.println(2500 - amount_to_pay);

        Customer reg = new Regular(new dis_15());
        amount_to_pay= reg.getprice(2500);
        System.out.println(2500 - amount_to_pay);
        
        Customer fir = new First(new dis_25());
        amount_to_pay= fir.getprice(2500);
        System.out.println(2500 - amount_to_pay);
        

    }
    
}
