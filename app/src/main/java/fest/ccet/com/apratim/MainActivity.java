package fest.ccet.com.apratim;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Events", "Schedule", "Register"};
    int Numboftabs = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);


        adapter = new ViewPagerAdapter(getSupportFragmentManager(), Titles, Numboftabs);

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        tabs = (SlidingTabLayout) findViewById(R.id.tabs);


        tabs.setDistributeEvenly(true); /* To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width */


        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }


        });

        tabs.setViewPager(pager);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.menu_sponsors:
                Intent intent = new Intent(this, Sponsors.class);
                this.startActivity(intent);
                break;

            case R.id.item1:
                Intent i = new Intent(getApplicationContext(), AboutApratim.class);
                startActivity(i);
                return false;
            case R.id.item2:
                String url = "http://www.apratim15.com";
                Intent in = new Intent(Intent.ACTION_VIEW);
                in.setData(Uri.parse(url));
                startActivity(in);
                return false;
            case R.id.item3:
                Intent intent1 = new Intent(getApplicationContext(), Team.class);
                startActivity(intent1);
                return false;
            case R.id.item4:
                Intent intent2 = new Intent(getApplicationContext(), Developers.class);
                startActivity(intent2);
                return false;

            default:
                return super.onOptionsItemSelected(item);

        }

        return false;
    }
}
