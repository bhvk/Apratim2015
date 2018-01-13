package fest.ccet.com.apratim;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DELL on 9/3/2015.
 */
public class Main4 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main4);

        ExpandableListView elv=(ExpandableListView) findViewById(R.id.expandableListView1);

        final ArrayList<Event> event;
        event = getData();
        CustomAdapter adapter=new CustomAdapter(this, event);
        elv.setAdapter(adapter);

        elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            public boolean onChildClick1(ExpandableListView parent, View v, int groupPosition, int childPosition,long id){

                Toast.makeText(getApplicationContext(), event.get(groupPosition).titles.get(childPosition), Toast.LENGTH_SHORT).show();


                return false;
            }

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                return false;
            }
        });
    }

    private ArrayList<Event> getData()
    {
        Event t1=new Event("Counter Strike 1.6");

        Event t2=new Event("Fifa 14");

        Event t3=new Event("NFS:Most Wanted");

        ArrayList<Event> allTeams=new ArrayList<Event>();
        allTeams.add(t1);
        allTeams.add(t2);
        allTeams.add(t3);

        return allTeams;
    }
}





