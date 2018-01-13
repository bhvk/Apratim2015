package fest.ccet.com.apratim;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Tab2 extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.tab_2, container, false);
    }
    public void onStart(){
        super.onStart();
        ImageView fb = (ImageView)getActivity().findViewById(R.id.fb_icon);
        ImageView insta = (ImageView)getActivity().findViewById(R.id.insta_icon);
        ImageView cultural = (ImageView)getActivity().findViewById(R.id.cult);
        ImageView technical = (ImageView)getActivity().findViewById(R.id.tech);
        ImageView mega = (ImageView)getActivity().findViewById(R.id.mega_ev);
        ImageView literary = (ImageView)getActivity().findViewById(R.id.lit);
        ImageView langaming = (ImageView)getActivity().findViewById(R.id.lan);
        ImageView funevents = (ImageView)getActivity().findViewById(R.id.fun);

        fb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "http://www.facebook.com/apratimccet";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "https://i.instagram.com/apratim2k15/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        cultural.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main.class);
                startActivity(intent);

            }
        });

        technical.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main1.class);
                startActivity(intent);

            }
        });

        mega.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main2.class);
                startActivity(intent);

            }
        });

        literary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main3.class);
                startActivity(intent);

            }
        });

        funevents.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main5.class);
                startActivity(intent);

            }
        });
        langaming.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main4.class);
                startActivity(intent);

            }
        });

    }
}