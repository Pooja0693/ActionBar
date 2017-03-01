package com.example.ideal.actionbar;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        getSupportActionBar().setTitle("Videos");
       //getSupportActionBar().setTitle("PDF");
        //getSupportActionBar().setTitle("Test");// set the top title
        String title = actionBar.getTitle().toString(); // get the title
        //actionBar.hide();
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movies, menu);
        return true;
    }
    public void onComposeAction(MenuItem mi) {
        Toast.makeText(getApplicationContext(), "home screen", Toast.LENGTH_SHORT).show();
    }

    public void onComposeAction1(MenuItem mi) {
        Toast.makeText(getApplicationContext(), "hello screen", Toast.LENGTH_LONG).show();
    }

}


