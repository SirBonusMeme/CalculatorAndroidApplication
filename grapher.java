//Sajeeth Wimalasuriyan
//January 16, 2018
//Purpose:Make a complex calulator with a graph, history and other complex functions.
//This is part of the gra[hing calculator api i did not make this but i did heavily modify it to get it to work.
//This software is open source and i can legally use and redistribute it.
//This graph is a matter of importing the api in the gradle but it was giving me issues so i just put all the code locally on my app.
//Touch has been disabled for the graph in this class to prevent crashing.

package com.swcorp.www.calculator;


import android.app.*;
import android.content.Intent;
import android.os.*;
import android.view.*;
import android.view.View.OnTouchListener;
import android.widget.*;

import com.swcorp.www.calculator.R;
import com.swcorp.www.calculator.WorkingGraph.Graph;

public class grapher extends Activity implements OnTouchListener
{
    private String fx;
    private EditText functionEdit;
    private Button functionBtn;
    private Graph graph;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grapher);
        fx = "";
        graph = ((Graph)findViewById(R.id.canvas));
        graph .setFocusable(false);
        graph .setFocusableInTouchMode(false);
        graph .setClickable(false);

        functionBtn = (Button)findViewById(R.id.functionBtn);

        functionEdit = (EditText)findViewById(R.id.function);

        functionBtn.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        fx = functionEdit.getText().toString();
                        graph.setFX(fx);
                    }
                });



    }

    public boolean onTouch(View view, MotionEvent event)
    {
        int x = (int) event.getX();
        graph.getF(x);
        return false;



    }
    public void gclick2(View view){
        showToastMessage("Going To Calculator", 900);
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);//Goes to title screen of game after splashscreen.
        startActivity(intent);

    }
    public void gclick3(View view){
        showToastMessage("Going To Instructions", 900);
        Intent intent = new Intent(getApplicationContext(),Instructions.class);//Goes to title screen of game after splashscreen.
        startActivity(intent);

    }
    public void showToastMessage(String text, int duration){
        final Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, duration);
    }

}


