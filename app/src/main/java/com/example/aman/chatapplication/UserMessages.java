package com.example.aman.chatapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.aman.chatapplication.R;

public class UserMessages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_messages);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user_messages, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_1) {
            return true;
        }
        if (id == R.id.action_2) {
            return true;
        }
        if (id == R.id.action_3) {
            return true;
        }
        if (id == R.id.action_4) {
            return true;
        }
        if (id == R.id.action_5) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}