package com.example.android.andyappportfolio;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOnClick(View view) {
        int btnNameId = 0;
        switch(view.getId()) {
            case R.id.mediaStreamerBtn:
                btnNameId = R.string.media_streamer;
                break;
            case R.id.superDuo1Btn:
                btnNameId = R.string.super_duo1;
                break;
            case R.id.superDuo2Btn:
                btnNameId = R.string.super_duo2;
                break;
            case R.id.antTerminatorBtn:
                btnNameId = R.string.ant_terminator;
                break;
            case R.id.materializeBtn:
                btnNameId = R.string.materialize;
                break;
            case R.id.capstoneBtn:
                btnNameId = R.string.capstone;
                break;
        }
        if (btnNameId != 0) {
            // Show toast for each button click
            Context context = getApplicationContext();
            CharSequence toastText = "This button will open " + getResources().getString(btnNameId) + "!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, toastText, duration);
            toast.show();
        }
    }
}
