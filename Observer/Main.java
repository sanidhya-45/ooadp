package ooadp.Observer;

public class Main {
    public static void main(String [] args)
    {
        Store st= new Store();

        Customer sanidhya= new Customer("Sanidhya" );
        Customer pranesh= new Customer("Pranesh");
        st.addObserver(pranesh);
        st.addObserver(sanidhya);

        Discount Diwali= new Discount("Diwali offer", 30 );
        Discount Holi= new Discount("Offer on sweets", 15);

        st.notify(Diwali);
        st.announce(Holi);

    }
    
}
