package com.tecii.android.actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg =  (EditText) findViewById(R.id.txtMsg);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_search) {
            txtMsg.setText("Search...");
            return true;
        }
        else if (id == R.id.action_share) {
            txtMsg.setText("Share...");
            return true;
        }
        else if (id == R.id.action_download) {
            txtMsg.setText("Download...");
            return true;
        }
        else if (id == R.id.action_about) {
            txtMsg.setText("About...");
            return true;
        }
        else if (id == R.id.action_settings) {
            txtMsg.setText("Settings...");
            return true;
        }
        return false;
    }
}
