package fest.ccet.com.apratim;

import java.util.ArrayList;

/**
 * Created by DELL on 8/26/2015.
 */
public class Event {
    public String Name;
    public String Image;
    public ArrayList<String> titles = new ArrayList<String>();

    public Event(String Name)
    {
        this.Name=Name;

    }
    @Override
    public String toString()
    {
        return Name;

    }

}
