package ooadp.facade;

public class Facade {
    Itemspurchased ip;
    ProcessSales ps;

    Facade(boolean giftcard, double amount)
    {
        ip= new Itemspurchased();
        ip.storePurchaseDetails();
        int num= ip.getNumItemTypes();
        ps= new ProcessSales(giftcard, num, amount );
    }
    void amounttopay()
    {
        ps.calculate();
    }
    void displayitems()
    {
        ip.itemspurchased();
    }
}
