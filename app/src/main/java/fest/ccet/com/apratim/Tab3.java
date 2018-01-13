package fest.ccet.com.apratim;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by bhavuk on 15/08/15.
 */
public class Tab3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_3, container, false);
        return v;
    }

    public void onStart() {
        super.onStart();
        ImageView register = (ImageView) getActivity().findViewById(R.id.form);
        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/forms/d/1dTl4Wyvk-ocGpDJw91EtF9Mk1GKdXuzPJ5vlR4rOZ6I/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
