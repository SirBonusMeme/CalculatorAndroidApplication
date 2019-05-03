//Sajeeth Wimalasuriyan
//December/12/2017
//SpashScreen
//This entire splashscreen is an extra feature which gives the game a professional feel.
//Also there is a progress bar on this screen which is seen in the xml.
package com.swcorp.www.calculator;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread myThread = new Thread(){
            @Override
            public void run() {//Initiates the thread.
                try {//Uses try and catch so there wont be any crashes.
                    sleep(3900);
                    //Timing of how long SplashScreen stays on for.
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);//Goes to title screen of calculator after splashscreen.
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();//This is a thread we did not learn this in class but I did research and somewhat understand it.
    }
}
