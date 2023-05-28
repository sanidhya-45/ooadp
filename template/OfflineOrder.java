package ooadp.template;
import java.util.*;

public class OfflineOrder extends Template {
    Scanner sc= new Scanner(System.in);

    @Override
    void selectItem()
    {
        HashMap< String, Integer> hm= new HashMap<String, Integer>();
        System.out.println(" ENter no of items :");
        int n= sc.nextInt();
        System.out.println(hm);
        System.out.println(" you can try out items in the Trial room");
    }

    @Override
    void doPayment()
    {
        System.out.println("Enter bill amount");
        double bill = sc.nextDouble();

        System.out.println(" you can pay in Cash or Debit/Credit Card");
        System.out.println("thank you for making payment");
    }

    @Override
    void doDelivery()
    {
        System.out.println("you can collect your order from the counter");
        System.out.println(" Thank you for shopping with us!");
    }
}
