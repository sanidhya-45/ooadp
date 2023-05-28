package ooadp.Observer;

public interface Festival {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notify(Discount d);
    
}
