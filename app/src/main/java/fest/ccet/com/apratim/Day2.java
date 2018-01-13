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
public class Day2 extends Activity {

    private ListView contactlist;

    private DaytwoAdapter daytwoAdapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

// TODO Auto-generated method stub

        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_daytwo);

        contactlist=(ListView)findViewById(R.id.listView2);

        daytwoAdapter=new DaytwoAdapter(this);

        contactlist.setAdapter(daytwoAdapter);


    }



    private class DaytwoAdapter extends BaseAdapter {


        private Context context;



        String []eventname1 ={"Mime","Movie Making","Stage Play","AD-Mad",
                "Solo singing + Inst(Prelims)","Solo singing + Inst(Finals)",
                "Rangoli","Graffiti",
                "Treasure Hunt","Minute to win it","Mock the Rock",
                "Group Dance and Fashion Show","Star Night",
                "Bridge Making","Brain-Quiilla", "Game of Drones","Maze Runner(Round 2)","Aqua Jet","Robo Wars","Code Mania",
                "Vivify(Photoshop)",
                "LAN Gaming(Semi-final and final)",
                "National Parliamentary Debate","Conventional Debate Eng(finals)"
        };

        String []time1={"10am-12pm","11am-2pm","1pm-4pm","3pm-4pm",
                "10am-12pm","12pm-1pm",
                "10am-1pm","12pm-2pm",
                "12pm-4pm","Throughout","2pm-3pm",
                "4pm-7pm","7pm-9pm",
                "10am-12pm","11am-1pm","10am-1pm","2pm-4pm","11am-1pm","2pm-4pm","11am-12pm","12pm-2pm",
                "10am-6pm",
                "10am onwards","11am-12:30pm"
        };

        String []venue1={"MPH","CC","MPH","Fun Stage",
                "ED Hall","MPH",
                "Block B entrance","Parking Area",
                "Cafetaria Stairs","Fun Stage","Fun Stage",
                "Main Stage","Main Stage",
                "RCC lab(Block A)","LH7 and LH8","Football ground","Parking","Basketball ground","Parking","CC",
                "CL-7 lab",
                "CL6",
                "Block B","LH7"
        };


        public DaytwoAdapter(Context c){

            this.context=c;

        }

        @Override

        public int getCount() {

// TODO Auto-generated method stub

            return eventname1.length;

        }


        @Override

        public Object getItem(int position) {

// TODO Auto-generated method stub

            return eventname1[position];

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


                row=inflator.inflate(R.layout.daytwo_inflator,parent,false);



            }

            else{

                row=convertView;

            }

            TextView name=(TextView)row.findViewById(R.id.eventname1);

            TextView tym=(TextView)row.findViewById(R.id.time1);

            TextView ven=(TextView)row.findViewById(R.id.venue1);


            name.setText(eventname1[position]);

            tym.setText(time1[position]);

            ven.setText(venue1[position]);


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


