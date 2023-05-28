package ooadp.Observer;
import java.util.ArrayList;

public class Store implements Festival{
    // Store maintains list of observers
    private ArrayList<Observer> l= new ArrayList<Observer>();


    @Override
    public void addObserver(Observer o) {

        this.l.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       this.l.remove(o);
    }

    @Override
    public void notify(Discount d) {
        for(Observer iterator : l)
        {
            iterator.update(d);
            // will notify all
        }
    }

     public void announce(Discount d)
     {
        System.out.println("announcement" + d.desc());
        notify(d);
     }
    
}
