package ooadp.adapter;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args)
    {
        Mauritax m= new Mauritax();
        Decathlontax d= new Adapter(m);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount: ");
        double a= sc.nextDouble();

        double tax= d.calculate(a);
        System.out.println(tax);

    }
}
