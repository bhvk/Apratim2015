package fest.ccet.com.apratim;

import android.content.Intent;
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
public class Tab1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.tab_1, container, false);

        return v;
    }

    public void onStart() {
        super.onStart();
        ImageView da1 = (ImageView) getActivity().findViewById(R.id.d1);
        ImageView da2 = (ImageView) getActivity().findViewById(R.id.d2);
        da1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Day1.class);
                startActivity(intent);

            }
        });
       da2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Day2.class);
                startActivity(intent);

            }
        });


    }
}
