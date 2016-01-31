package com.example.android.sunshine.app;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public static String LOG_TAG = DetailActivityFragment.class.getSimpleName();
    public static String Forecast_Share_Hashtag = "#SunshineAPP";
    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        Intent intent = getActivity().getIntent();
        String weatherData = intent.getStringExtra(Intent.EXTRA_TEXT);
        ((TextView) rootView.findViewById(R.id.forecast_detail_textView)).setText(weatherData);
        return rootView;
    }
}
