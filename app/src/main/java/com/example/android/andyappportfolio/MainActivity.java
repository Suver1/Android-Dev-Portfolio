package com.example.android.andyappportfolio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOnClick(View view) {
        int btnNameId = 0;
        String packageName = null;
        switch(view.getId()) {
            case R.id.mediaStreamerBtn:
                packageName = getResources().getString(R.string.spotify_streamer_package);
                btnNameId = R.string.spotify_streamer;
                break;
            case R.id.superDuo1Btn:
                packageName = getResources().getString(R.string.football_scores_package);
                btnNameId = R.string.football_scores;
                break;
            case R.id.superDuo2Btn:
                btnNameId = R.string.alexandria;
                packageName = getResources().getString(R.string.alexandria_package);
                break;
            case R.id.buildItBigger:
                btnNameId = R.string.build_it_bigger;
                packageName = getResources().getString(R.string.build_it_bigger_package);
                break;
            case R.id.materializeBtn:
                btnNameId = R.string.materialize;
                break;
            case R.id.capstoneBtn:
                btnNameId = R.string.capstone;
                break;
        }
        // Toast if package don't exist
        if (btnNameId != 0 && packageName == null) {
            Context context = getApplicationContext();
            CharSequence toastText = "This button will open " + getResources().getString(btnNameId) + "!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, toastText, duration);
            toast.show();
        }
        // Open app
        if (packageName != null) {
            PackageManager pm = getPackageManager();
            try {
                Intent launchIntent = pm.getLaunchIntentForPackage(packageName);
                startActivity(launchIntent);
            }
            catch (Exception e) {
                Log.e(TAG, "could not launch " + packageName + ". Error: " + e.toString());
            }
        }
    }
}
