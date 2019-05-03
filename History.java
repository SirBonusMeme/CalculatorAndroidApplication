//Sajeeth Wimalasuriyan
//January 16, 2018
//Purpose:Make a complex calulator with a graph, history and other complex functions.
package com.swcorp.www.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class History extends AppCompatActivity {
//Data from the other activity is transmitted here via the intent so it comes to the screen with data.
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        ArrayList<String> histhold = (ArrayList<String>) getIntent().getSerializableExtra("history");
        //Above is a special array to hold a list which creates the history.

        ListAdapter myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, histhold);
        //This adapter allows me to add the special string array into the ListView creating a scrollable View with equations.
        ListView cool = (ListView) findViewById(R.id.his);
        cool.setAdapter(myAdapter);
        //ListView placed in the onCreate so the listview will update as soon as the user goes to this page.
    }
}
