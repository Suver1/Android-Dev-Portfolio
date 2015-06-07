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
    public void buttonOnClick(View view) {
        Context context = getApplicationContext();
        CharSequence buttonText = "";
        switch(view.getId()) {
            case R.id.button01:
                buttonText = getResources().getString(R.string.media_streamer);
                break;
            case R.id.button02:
                buttonText = getResources().getString(R.string.super_duo1);
                break;
            case R.id.button03:
                buttonText = getResources().getString(R.string.super_duo2);
                break;
            case R.id.button04:
                buttonText = getResources().getString(R.string.ant_terminator);
                break;
            case R.id.button05:
                buttonText = getResources().getString(R.string.materialize);
                break;
            case R.id.button06:
                buttonText = getResources().getString(R.string.capstone);
                break;
        }
        if (buttonText.length() != 0) {
            CharSequence toastText = "This button will open " + buttonText + "!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, toastText, duration);
            toast.show();
        }
    }
}
