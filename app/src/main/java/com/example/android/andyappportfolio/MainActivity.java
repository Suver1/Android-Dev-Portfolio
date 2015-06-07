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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void btnOnClick(View view) {
        int btnNameId = 0;
        switch(view.getId()) {
            case R.id.button01:
                btnNameId = R.string.media_streamer;
                break;
            case R.id.button02:
                btnNameId = R.string.super_duo1;
                break;
            case R.id.button03:
                btnNameId = R.string.super_duo2;
                break;
            case R.id.button04:
                btnNameId = R.string.ant_terminator;
                break;
            case R.id.button05:
                btnNameId = R.string.materialize;
                break;
            case R.id.button06:
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
