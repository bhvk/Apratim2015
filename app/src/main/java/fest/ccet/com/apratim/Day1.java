package fest.ccet.com.apratim;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by DELL on 9/22/2015.
 */
public class Day1 extends Activity {

    private ListView contactlist;

    private DayoneAdapter dayoneAdapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dayone);
        contactlist=(ListView)findViewById(R.id.listView1);
        dayoneAdapter=new DayoneAdapter(this);
        contactlist.setAdapter(dayoneAdapter);

    }
    private class DayoneAdapter extends BaseAdapter {
        private Context context;
        String []eventname ={"Inaugration","Skit","Street Play","Solo Dance(Prelims)","Duet Dance(Prelims)","Solo + Duet Dance (Finals)",
                "Antakshri","Tattoo Making","Collage Making",
                "Minute to win it","Face the Bull","Arm Wrestling","Street Soccer","RJ Hunt","I Am Beautiful",
                "Folk Dance","Fusion Band",
                "Town Planning","Slump It", "Quiz-Dom","Web Masterz","Free Flier","Robo Race","Line Seguidor","Maze Runner(Round 1)",
                "LAN Gaming(Prelims)",
                "National Parliamentary Debate","Conventional Debate Eng(prelims)","JAM","Group Discussion","Conventional Debate Hindi"
        };
        String []time={"10am-12pm","12pm-1:30pm","1:30pm-3:30pm","12:30pm-2:00pm","12:30pm-2:00pm","2:00pm-3:00pm",
                "11am-1pm","12:00pm","11:00am",
                "11:00am","1:00pm","12:00pm","11am","12:30pm","3:00-4:00pm",
                "4pm-5pm","5pm-6pm",
                "12pm-2pm","2pm-4pm","11am-12pm","12pm-1pm","12pm-2pm","2pm-4pm","10am-2pm","2pm-5pm",
                "11am-6pm",
                "12pm onwards","12pm-1:30pm","12pm-1:30pm","1pm-3pm","3pm-5pm"
        };

        String []venue={"MPH","MPH","Parking","ED Hall","ED Hall","MPH",
                "Pathshala","Cafetaria Backside","Cafetaria",
                "Stall","Stall","Fun Stage","Fun Stage","Fun Stage","MPH",
                "Main Stage","Main Stage or MPH",
                "CAD lab(Block A)","RCC lab(Block B)","LH7","CC(Block A)","Basketball ground","Behind Canteen","Block B","Block B",
                "CL6",
                "Block B","LH8","LH7","LH8","LH7"
        };
        public DayoneAdapter(Context c){
            this.context=c;
        }

        @Override
        public int getCount() {

// TODO Auto-generated method stub
            return eventname.length;

        }


        @Override
        public Object getItem(int position) {

// TODO Auto-generated method stub

            return eventname[position];

        }
        @Override

        public long getItemId(int position) {

// TODO Auto-generated method stub

            return position;

        }


        @Override

        public View getView(int position, View convertView, ViewGroup parent) {

// TODO Auto-generated method stub

            View row=null;

            if(convertView==null){

                LayoutInflater inflator=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row=inflator.inflate(R.layout.dayone_inflator,parent,false);
            }

            else{

                row=convertView;
            }

            TextView nam=(TextView)row.findViewById(R.id.eventname);

            TextView tim=(TextView)row.findViewById(R.id.time);

            TextView venu=(TextView)row.findViewById(R.id.venue);
            nam.setText(eventname[position]);
            tim.setText(time[position]);
            venu.setText(venue[position]);


            return row;

        }


    }

    @Override

    protected void onPause() {

// TODO Auto-generated method stub

        super.onPause();

        finish();

    }
}


