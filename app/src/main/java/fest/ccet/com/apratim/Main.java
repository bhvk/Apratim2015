package fest.ccet.com.apratim;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DELL on 8/26/2015.
 */
public class Main extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ExpandableListView elv = (ExpandableListView) findViewById(R.id.expandableListView1);


        final ArrayList<Event> event;
        event = getData();
        CustomAdapter adapter = new CustomAdapter(this, event);
        elv.setAdapter(adapter);


        elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            public boolean onChildClick1(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                Toast.makeText(getApplicationContext(), event.get(groupPosition).titles.get(childPosition), Toast.LENGTH_SHORT).show();


            return false;
        }

        @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
            // TODO Auto-generated method stub

            String item = ((TextView) v).getText().toString();
            Intent i = new Intent(getApplicationContext(), EventOnClick.class);
            startActivity(i);
            return false;
        }
        });
    }



        private ArrayList<Event> getData ()
        {
            Event t1 = new Event("Dramatics");
            t1.titles.add("Aarohan (Street Play)");
            t1.titles.add("Pratibimb (Stage Play)");
            t1.titles.add("Sab bikta hai (Ad Mad)");
            t1.titles.add("Abhivyakti (Mime)");
            t1.titles.add("Short Movie");
            t1.titles.add("Skit");

            Event t2 = new Event("Dance");
            t2.titles.add("Sizzle (Solo Dance)");
            t2.titles.add("Synchronize (Duet Dance)");

            Event t3 = new Event("Fine Arts");
            t3.titles.add("InkD (Tattoo Making)");
            t3.titles.add("Strokes of Genius (Face Painting)");
            t3.titles.add("Kalakriti (Rangoli Making)");
            t3.titles.add("Potpourri (Collage Making)");
            t3.titles.add("Graffiti");

            Event t4 = new Event("Music");
            t4.titles.add("Coalescence (Fusion Band)");
            t4.titles.add("Resonating Strings (Solo Instrumental)");
            t4.titles.add("Antakshari");
            t4.titles.add("Melody Height (Solo Singing)");

            ArrayList<Event> allTeams = new ArrayList<Event>();
            allTeams.add(t1);
            allTeams.add(t2);
            allTeams.add(t3);
            allTeams.add(t4);

            return allTeams;
        }
    }

