package ooadp.facade;
import java.util.HashMap;
import java.util.Scanner;

public class Itemspurchased {
    HashMap<String, Integer> hm;
    int numitem;

    Itemspurchased(){ 
        hm= new HashMap<String , Integer>();
    }
    int getNumItemTypes()
    {
        return numitem;
    }
    void itemspurchased()
    {
        System.out.println(hm);
    }

    void storePurchaseDetails()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of items: " );
        numitem= sc.nextInt();

        for(int i=0; i<numitem; i++)
        {
            System.out.println(" ENter item name :" + (i+1));
            String name= sc.next();
            System.out.println("Enter quantity of item :" + (i+1));
            int qt= sc.nextInt();
            hm.put(name, qt);
        }
       
    }
}
