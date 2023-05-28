package ooadp.facade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the bill amount?");
        double amount= sc.nextDouble();
        System.out.println(" Do you have gift card yes/no");
        boolean b= sc.nextBoolean();

        Facade f= new Facade(b, amount);
        f.amounttopay();
        f.displayitems();
    }
    
}
