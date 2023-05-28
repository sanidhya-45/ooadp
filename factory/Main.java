package ooadp.factory;

public class Main {
    public static void main( String[] args)
    {
        Create factory= new Create();

        TypeOfcustomer Senior= factory.createCustomer("SeniorCitizen");
        TypeOfcustomer Reuglar= factory.createCustomer("Regular");
        TypeOfcustomer Firsttime= factory.createCustomer("Firsttime");
        TypeOfcustomer Kid= factory.createCustomer("Kid");
        TypeOfcustomer Twenty= factory.createCustomer("Twenty");
        TypeOfcustomer Thirty= factory.createCustomer("Thirty");
        TypeOfcustomer Forty= factory.createCustomer("Forty");
        TypeOfcustomer Fifty= factory.createCustomer("Fifty");
        TypeOfcustomer Teenage= factory.createCustomer("Teenage");
        
        Senior.welcome();
        Reuglar.welcome();
        Firsttime.welcome();
        Kid.welcome();
        Twenty.welcome();
        Thirty.welcome();
        Forty.welcome();
        Fifty.welcome();
        Teenage.welcome();
        
    }
    
}
