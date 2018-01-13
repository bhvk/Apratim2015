package fest.ccet.com.apratim;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by DELL on 9/22/2015.
 */
public class Developers extends Activity {
    private ListView devlist;
    private DeveloperAdapter devAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developers);

        devlist=(ListView)findViewById(R.id.listView1);
        devAdapter=new DeveloperAdapter(this);
        devlist.setAdapter(devAdapter);


    }

    private class DeveloperAdapter extends BaseAdapter {

        private Context context;

        int [] images={R.drawable.harsha,R.drawable.bhavuk};

        String []name ={"Harsha","Bhavuk Sharma"};


        public DeveloperAdapter(Context c){
            this.context=c;
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return name.length;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return name[position];
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

                row=inflator.inflate(R.layout.developer_inflator,parent,false);


            }
            else{
                row=convertView;
            }
            TextView contact_name=(TextView)row.findViewById(R.id.textView1);

            contact_name.setText(name[position]);

            ImageView contact_image=(ImageView)row.findViewById(R.id.imageView1);
            contact_image.setImageResource(images[position]);


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



