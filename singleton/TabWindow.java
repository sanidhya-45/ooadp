package ooadp.singleton;
import java.util.ArrayList;

public class TabWindow {
    private ArrayList<String>  urls;
    private static TabWindow sc;
    private TabWindow()
    {
        urls= new ArrayList<String>();
    }
    public static TabWindow getInstance()
    {
        if(sc==null)
            sc= new TabWindow();
        return sc;
    }
    public void add(String s)
    {
        urls.add(s);
    }
    public void show()
    {
        for( String s: urls)
            System.out.println(s);
    }
}
