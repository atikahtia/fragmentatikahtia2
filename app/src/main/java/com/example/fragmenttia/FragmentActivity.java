package com.example.fragmenttia;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    @Override
    public Boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return  true;
    }

    @Override
    public Boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.acction_settings){
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
