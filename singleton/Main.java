package ooadp.singleton;

public class Main {
    public static void main(String[] args)
    {
        TabWindow w1=TabWindow.getInstance();
        TabWindow w2=TabWindow.getInstance();

        w1.add("www.san-andreas.com");
        w2.add("www.jiocinema.com");

        TabWindow w3= TabWindow.getInstance();
        w3.show();
    }
    
}
