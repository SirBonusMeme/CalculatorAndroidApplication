//Sajeeth Wimalasuriyan
//January 16, 2018
//Purpose:Make a complex calulator with a graph, history and other complex functions.
//The instructions page does not have any special methods it simply tells the user what a button does when they click it.
//Each button will update the calculation screen so the user can click what they need.
package com.swcorp.www.calculator;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.swcorp.www.calculator.R.id.screen;
import static com.swcorp.www.calculator.R.id.screen2;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
    }
    public void next1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Allows user to go to second screen");

    }

public void history1 (View view){
    TextView digit2 = (TextView) findViewById(screen2);
    digit2.setText("");
    TextView digit = (TextView) findViewById(screen);
    digit.setText("Displays a complete log of all the calculations you entered");
}

    public void graph1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Allows user to graph simple graphs (Use * for multiplication)");


    }

    public void ncr1(View view) {
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);

        digit.setText("Enter the N value here then click next to enter R value");
        digit2.setText("Enter the R value here then click enter (=)");



    }

    public void croot1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a cube root enter a value before or after clicking it");

    }

    public void ans1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This remembers the previous value");
    }

    public void bin1(View view) {

        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Converts the decimal number system to Binary");


    }

    public void zero1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Enters the number 0 into the calculator");



    }

    public void one1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Enters the number 1 into the calculator");



    }

    public void two1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Enters the number 2 into the calculator");



    }

    public void three1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Enters the number 3 into the calculator");



    }

    public void four1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Enters the number 4 into the calculator ");



    }

    public void five1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Enters the number 5 into the calculator ");



    }

    public void six1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Enters the number 6 into the calculator ");



    }

    public void seven1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Enters the number 7 into the calculator ");



    }

    public void hex1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Converts the decimal number system to Hexadecimal ");



    }

    public void octal1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Converts the decimal number system to Octal ");




    }

    public void eight1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Enters the number 8 into the calculator ");



    }

    public void nine1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Enters the number 9 into the calculator");



    }

    public void clear1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Clears all the values on screen ");



    }



    public void plus1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Allows for the addition of 2 numbers");



    }



    public void minus1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Allows for the subtraction of 2 numbers");


    }

    public void log1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is the log function enter a value before or after clicking it");



    }

    public void pm1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This function takes the current value and inverts it");



    }

    public void root1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a square root enter a value before or after clicking it");



    }




    public void percent1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Finds the remainder while dividing 2 number ");




    }

    public void pie1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This function is Pi which represents 3.14 (multiplication ex) 9π)");




    }

    public void sin1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a sin function enter a value before or after clicking it");




    }

    public void cos1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a cos function enter a value before or after clicking it");


    }

    public void tan1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a tan function enter a value before or after clicking it");



    }

    public void delete1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Removes digits on the screens one at a time");


    }

    public void divide1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Allows for the division of 2 numbers");


    }

    public void multi1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Allows for the multiplication of 2 numbers");


    }

    public void exponent1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Allows for a exponent to be applied to a number");

    }

    public void npr1(View view) {

        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);

        digit.setText("Enter the N value here then click next to enter R value");
        digit2.setText("Enter the R value here then click enter (=)");








    }
    public void leave1(View view){
        showToastMessage("Going To Calculator", 900);
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);//Goes to title screen of game after splashscreen.
        startActivity(intent);

    }
    public void equal1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("After clicking this button you should get a answer if there are no errors");




    }


    public void sinh1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a sinh function enter a value before or after clicking it");


    }

    public void cosh1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a cosh function enter a value before or after clicking it");



    }

    public void tanh1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a tanh function enter a value before or after clicking it");



    }

    public void asin1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a asin function enter a value before or after clicking it");



    }

    public void acos1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a acos function enter a value before or after clicking it");



    }

    public void atan1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is atan function enter a value before or after clicking it");


    }

    public void dot1(View view) {
        TextView digit2 = (TextView) findViewById(screen2);
        digit2.setText("");
        TextView digit = (TextView) findViewById(screen);
        digit.setText("This is a decimal which can be placed anywhere on screen");


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
