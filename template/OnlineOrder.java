package ooadp.template;
import java.util.*;

public class OnlineOrder extends Template {
    Scanner sc= new Scanner(System.in);

    @Override
    void selectItem()
    {
        HashMap< String, Integer> hm= new HashMap<String, Integer>();
        System.out.println(" ENter no of items :");
        int n= sc.nextInt();

        for(int i=0; i<n; i++)
        {
            System.out.println(" ENter item name :" + (i+1));
            String name= sc.next();
            System.out.println("Enter quantity of item :" + (i+1));
            int qt= sc.nextInt();
            hm.put(name, qt);
        }
        System.out.println(hm);
    }

    @Override
    void doPayment()
    {
        System.out.println("Enter bill amount");
        double bill = sc.nextDouble();

        System.out.println(" choose any of the following for payment ( this includes charges for delivery also) Net- Banking\n  Gift-Card");
        System.out.println(" Payment Processing");
        System.out.println("thank you for making payment");
    }

    @Override
    void doDelivery()
    {
        System.out.println("Please enter your addres");
        String add= sc.next();
        System.out.println(" Thank you for shopping with us!");
    }
}
