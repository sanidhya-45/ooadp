package ooadp.Observer;

public class Discount {
    private String description;
    private double percent;

    public Discount( String s, double p)
    {
        description=s;
        percent=p;
    }
    public String desc()
    {
        return description;
    }
    public double percentage()
    {
        return percent;
    }

}
