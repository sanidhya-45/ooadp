package ooadp.Observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name)
    {
        this.name= name;
    }

    @Override
    public void update(Discount d) {
        System.out.println(name + " discount" + d.desc() + " -" + d.percentage() );
    }
    
}
