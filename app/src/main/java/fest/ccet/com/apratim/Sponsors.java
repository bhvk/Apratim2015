package fest.ccet.com.apratim;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Sponsors extends Activity {
    GridView mygrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);


        mygrid=(GridView)findViewById(R.id.gridViewSponsor);
        //mygrid.setExpanded(true);
        mygrid.setAdapter(new GridAdapter(this));
    }

    private class GridAdapter extends BaseAdapter
    {
        private List<Item> items = new ArrayList<Item>();
        private LayoutInflater inflater;

        public GridAdapter(Context context)
        {
            inflater = LayoutInflater.from(context);

            items.add(new Item("Renault", R.drawable.renault_logo));
            items.add(new Item("Plix", R.drawable.plix_logo));
            items.add(new Item("Big Fat Pizza", R.drawable.bigfat_logo));
            items.add(new Item("BTEC", R.drawable.btec_logo));
            items.add(new Item("Ethos", R.drawable.ethos_logo));
            items.add(new Item("LIC", R.drawable.lic));
            items.add(new Item("BRICS", R.drawable.brics));
            items.add(new Item("SBI", R.drawable.sbi));
            //add more sponsors here
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i)
        {
            return items.get(i);
        }

        @Override
        public long getItemId(int i)
        {
            return items.get(i).drawableId;
        }
        private int lastPosition = -1;
        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            View v = view;
            ImageView picture;
            TextView name;

            if(v == null)
            {
                v = inflater.inflate(R.layout.sponsors_inflator, viewGroup, false);
                v.setTag(R.id.picture, v.findViewById(R.id.picture));
                v.setTag(R.id.text, v.findViewById(R.id.text));
            }

            picture = (ImageView)v.getTag(R.id.picture);
            name = (TextView)v.getTag(R.id.text);

            Item item = (Item)getItem(i);

            picture.setImageResource(item.drawableId);
            name.setText(item.name);



            return v;
        }

        private class Item
        {
            final String name;
            final int drawableId;

            Item(String name, int drawableId)
            {
                this.name = name;
                this.drawableId = drawableId;
            }
        }

    }
}
