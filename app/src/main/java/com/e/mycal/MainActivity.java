package com.e.mycal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity<MenuOption> extends AppCompatActivity {

    ListView listView;
    String[] items = {"Simple Calculator", "Date Picker"} ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);


        listView = findViewById (R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, items );
        listView.setAdapter (adapter);

        listView.setOnItemClickListener (new AdapterView.OnItemClickListener ( ) {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent (MainActivity.this,activityCal.class);
                        startActivity (intent);
                        break;

                    case 1:

                        intent = new Intent (MainActivity.this, displayInfo.class);
                        startActivity (intent);
                        break;
                }
            }
        });

    }
}
