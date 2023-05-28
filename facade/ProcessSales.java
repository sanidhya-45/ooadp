package ooadp.facade;
import java.util.*;
public class ProcessSales {
    boolean giftcard;
    int number;
    double amount;

    ProcessSales(boolean giftcard, int num, double amount)
    {
        this.giftcard=giftcard;
        number= num;
        this.amount= amount;
    }
    void calculate()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter gift card value");
        double gt= sc.nextDouble();

        if(number >1)
        {
            System.out.println(" only one item can be bought using the giftcard!, giftcard not applicable");
            System.out.println(" Total amount :" + amount);
        }
        else if(number<=0)
            System.out.println(" go to mr.beast if u dont want to buy");
        else if(gt< amount)
        {
            System.out.println(" Amount to be paid is: "+ (amount-gt));

        }
        else {
            System.out.println(" giftcard value left: " + (gt- amount));
        }
     
    }
}
