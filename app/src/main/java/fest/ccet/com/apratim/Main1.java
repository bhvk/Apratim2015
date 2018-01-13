package fest.ccet.com.apratim;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DELL on 8/30/2015.
 */
public class Main1 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);

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
        Event t1=new Event("CSE");
        t1.titles.add("Code Mania");
        t1.titles.add("QuizDom");
        t1.titles.add("Web Masterz");
        t1.titles.add("Vivify(Photoshop)");

        Event t2=new Event("ECE");
        t2.titles.add("Line Seguidor");
        t2.titles.add("Brain-Quiilla");
        t2.titles.add("Maze Runner");
        t2.titles.add("Game of Drones");

        Event t3=new Event("CIVIL");
        t3.titles.add("Bridge Making");
        t3.titles.add("Town Planning");
        t3.titles.add("Slump it");

        Event t4=new Event("MECHANICAL");
        t4.titles.add("Robo Race");
        t4.titles.add("Free Fliers");
        t4.titles.add("Aqua Jet");
        t4.titles.add("Robo Wars");

        ArrayList<Event> allTeams=new ArrayList<Event>();
        allTeams.add(t1);
        allTeams.add(t2);
        allTeams.add(t3);
        allTeams.add(t4);

        return allTeams;
    }
}


