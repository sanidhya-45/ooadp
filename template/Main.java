package ooadp.template;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Do you want to do online (1) or offline shopping (0) ?");
        int ch= sc.nextInt();
        if(ch==1)
        {
            Template t1= new OnlineOrder();
            t1.selectItem();
            t1.doPayment();
            t1.doDelivery();
        }
        else{
            Template t2= new OfflineOrder();
            t2.selectItem();
            t2.doPayment();
            t2.doDelivery();
        }
    }
    
}
