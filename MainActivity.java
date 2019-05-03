//Sajeeth Wimalasuriyan
//January 16, 2018
//Purpose:Make a complex calulator with a graph, history and other complex functions.
package com.swcorp.www.calculator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Stack;

import static com.swcorp.www.calculator.R.id.his;
import static com.swcorp.www.calculator.R.id.multi;
import static com.swcorp.www.calculator.R.id.screen;
import static com.swcorp.www.calculator.R.id.screen2;

public class MainActivity extends AppCompatActivity {

    double save = 0;//Saves values on the left side of a equation prior to a calculation.
    double save2 = 0;//Saves values on the rogh side of a equation prior to a calculation.
    String redo = " ";//Helps to store the prior equation before they are pushed into a stack.
    //Below are all the global variables which track which buttons are clicked.
    int trackerlog = 0;
    int trackerdot = 0;
    int trackerper = 0;
    int trackerexp = 0;
    int trackersin = 0;
    int trackercos = 0;
    int trackertan = 0;
    int trackerasin = 0;
    int trackeracos = 0;
    int trackeratan = 0;
    int trackernpr = 0;
    int trackerncr = 0;
    int trackerdiv = 0;
    int trackermul = 0;
    int trackerroot = 0;
    int trackerpi = 0;
    int trackerplus = 0;
    int trackerroot3 = 0;
    int trackerminus = 0;
    int trackersinh = 0;
    int trackercosh = 0;
    int trackerhis = 0;
    int trackertanh = 0;
    //End of button Trackers.
    double answer = 0;//Stores the immediate answer from an equation.
    int screenhelp = 0;//Helps the user navigate to the secound screen for operations like npr.
    Stack s = new Stack();//Stack which holds all the prior equations.
    ArrayList<String> histhold = new ArrayList<>();//Array which holds the history in a listview.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void next1(View view) {//Next button.
        screenhelp++;

    }

    public void instruc1(View view) {//Instructions button.
        Intent intent = new Intent(getApplicationContext(), Instructions.class);//Goes to instructions screen.
        startActivity(intent);
    }

    public void history1(View view) {//History button.
        Intent intent = new Intent(getApplicationContext(), History.class);//Goes to title screen of game after splashscreen.
        intent.putExtra("history", histhold);
        startActivity(intent);
    }

    public void graph1(View view) {//Graph button.
        Intent intent = new Intent(getApplicationContext(), grapher.class);//Goes to title screen of game after splashscreen.
        startActivity(intent);
    }

    public void ncr1(View view) {//Ncr button.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);

        digit.setText("N=");
        digit2.setText("R=");

        trackerncr++;

    }

    public void croot1(View view) {//Cube root button.
        TextView digit = (TextView) findViewById(screen);
        digit.setText("3√" + digit.getText());
        trackerroot3++;
    }

    public void ans1(View view) {//Answer button.
        TextView digit = (TextView) findViewById(screen);
        String answercon = Double.toString(answer);
        digit.setText(digit.getText() + "" + answercon);
    }

    public void bin1(View view) {//Decimal to binary button.
        TextView digit = (TextView) findViewById(screen);

        try {

            Double der = new Double(Double.parseDouble(digit.getText().toString()));
            int inssave = der.intValue();
            String keep = Integer.toBinaryString(inssave);
            digit.setText(keep);


        } catch (Exception e) {
            showToastMessage("SYNTAX ERROR", 570);
            reset();

        }

    }

    public void zero1(View view) {//Number button (0-9).
        if (screenhelp == 0) {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "0");
        } else {
            TextView digit2 = (TextView) findViewById(screen2);
            digit2.setText(digit2.getText() + "0");
        }


    }

    public void one1(View view) {//Number button (0-9).
        if (screenhelp == 0) {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "1");
        } else {
            TextView digit2 = (TextView) findViewById(screen2);
            digit2.setText(digit2.getText() + "1");
        }

    }

    public void two1(View view) {//Number button (0-9).
        if (screenhelp == 0) {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "2");
        } else {
            TextView digit2 = (TextView) findViewById(screen2);
            digit2.setText(digit2.getText() + "2");
        }


    }

    public void three1(View view) {//Number button (0-9).
        if (screenhelp == 0) {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "3");
        } else {
            TextView digit2 = (TextView) findViewById(screen2);
            digit2.setText(digit2.getText() + "3");
        }


    }

    public void four1(View view) {//Number button (0-9).
        if (screenhelp == 0) {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "4");
        } else {
            TextView digit2 = (TextView) findViewById(screen2);
            digit2.setText(digit2.getText() + "4");
        }


    }

    public void five1(View view) {//Number button (0-9).
        if (screenhelp == 0) {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "5");
        } else {
            TextView digit2 = (TextView) findViewById(screen2);
            digit2.setText(digit2.getText() + "5");
        }


    }

    public void six1(View view) {//Number button (0-9).
        if (screenhelp == 0) {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "6");
        } else {
            TextView digit2 = (TextView) findViewById(screen2);
            digit2.setText(digit2.getText() + "6");
        }


    }

    public void seven1(View view) {//Number button (0-9).
        if (screenhelp == 0) {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "7");
        } else {
            TextView digit2 = (TextView) findViewById(screen2);
            digit2.setText(digit2.getText() + "7");
        }


    }

    public void hex1(View view) {//Decimal to hexadecimal button.
        TextView digit = (TextView) findViewById(screen);
        try {
            Double der = new Double(Double.parseDouble(digit.getText().toString()));
            int inssave = der.intValue();
            String keep = Integer.toHexString(inssave);
            digit.setText(keep);


        } catch (Exception e) {
            e.printStackTrace();
            showToastMessage("SYNTAX ERROR", 570);
            reset();

        }


    }

    public void octal1(View view) {//Decimal to octal button.
        TextView digit = (TextView) findViewById(screen);
        try {
            Double der = new Double(Double.parseDouble(digit.getText().toString()));
            int inssave = der.intValue();
            String keep = Integer.toOctalString(inssave);
            digit.setText(keep);

        } catch (Exception e) {
            e.printStackTrace();
            showToastMessage("SYNTAX ERROR", 570);
            reset();


        }


    }

    public void eight1(View view) {//Number button (0-9).
        if (screenhelp == 0) {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "8");
        } else {
            TextView digit2 = (TextView) findViewById(screen2);
            digit2.setText(digit2.getText() + "8");
        }


    }

    public void nine1(View view) {//Number button (0-9).
        if (screenhelp == 0) {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "9");
        } else {
            TextView digit2 = (TextView) findViewById(screen2);
            digit2.setText(digit2.getText() + "9");
        }


    }

    public void clear1(View view) {//Clear button.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        digit.setText(" ");
        digit2.setText(" ");

    }

    public void plus1(View view) {//Plus button.

        if (trackerplus >= 1) {
        } else {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "+");
            trackerplus++;
        }

    }

    public void minus1(View view) {//Minus button.
        if (trackerminus >= 1) {

        } else {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "-");
            trackerminus++;
        }

    }

    public void log1(View view) {//Log button.
        TextView digit = (TextView) findViewById(screen);
        digit.setText("Log" + digit.getText());
        trackerlog++;


    }

    public void pm1(View view) {//Plus or minus button.
        TextView digit = (TextView) findViewById(screen);
        double temp = answer * -1;
        answer = temp;

        String savet = Double.toString(answer);
        digit.setText(savet);


    }

    public void root1(View view) {//Square root button.
        TextView digit = (TextView) findViewById(screen);
        digit.setText("√" + digit.getText());
        trackerroot++;


    }

    public void percent1(View view) {//Mod Button.
        if (trackerper >= 1) {

        } else {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "%");
            trackerper++;
        }
    }

    public void pie1(View view) {//Pie button
        if (trackerpi >= 1) {

        } else {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "Π");
            trackerpi++;

        }
    }

    public void sin1(View view) {//Sin button.
        TextView digit = (TextView) findViewById(screen);
        digit.setText("sin" + digit.getText());
        trackersin++;


    }

    public void cos1(View view) {//Cos button
        TextView digit = (TextView) findViewById(screen);
        digit.setText("cos" + digit.getText());
        trackercos++;

    }

    public void tan1(View view) {//Tan button.
        TextView digit = (TextView) findViewById(screen);
        digit.setText("tan" + digit.getText());
        trackertan++;


    }

    public void delete1(View view) {//Delete button.
        TextView digit = (TextView) findViewById(screen);
        String text = digit.getText().toString();
        if (digit.length() != 0) {
            digit.setText(text.substring(0, text.length() - 1));
            showToastMessage("Delete", 300);
        } else
            showToastMessage("Nothing To Delete", 300);

    }

    public void divide1(View view) {//Divide button.
        if (trackerdiv >= 1) {

        } else {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "÷");
            trackerdiv++;
        }


    }

    public void multi1(View view) {//Multiplication button.
        if (trackermul >= 1) {

        } else {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "X");
            trackermul++;
        }


    }

    public void exponent1(View view) {//Power to button.
        if (trackerexp >= 1) {

        } else {
            TextView digit = (TextView) findViewById(screen);
            digit.setText(digit.getText() + "^");
            trackerexp++;

        }

    }

    public void npr1(View view) {//Npr button.

        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        digit.setText("");
        digit.setText("N=");
        digit2.setText("R=");

        trackernpr++;


    }

    public void equal1(View view) {//Equal button.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        redo = digit.getText().toString();
        s.add(redo);
        trackerhis++;
        mathlogic();
        String holder = redo + "=" + answer;
        histhold.add(holder);
        reset();


    }

    public void redo1(View view) {//Redo button.
        TextView digit = (TextView) findViewById(screen);
        if (s.size() != 0) {
            String shold = s.pop().toString();
            digit.setText(shold);
        }


    }

    public void sinh1(View view) {//Sinh button
        TextView digit = (TextView) findViewById(screen);
        digit.setText("sinh" + digit.getText());
        trackersinh++;


    }

    public void cosh1(View view) {//Cosh button.
        TextView digit = (TextView) findViewById(screen);
        digit.setText("cosh" + digit.getText());
        trackercosh++;


    }

    public void tanh1(View view) {//Tanh button
        TextView digit = (TextView) findViewById(screen);
        digit.setText("tanh" + digit.getText());
        trackertanh++;


    }

    public void asin1(View view) {//Asin button.
        TextView digit = (TextView) findViewById(screen);
        digit.setText("asin" + digit.getText());
        trackerasin++;


    }

    public void acos1(View view) {//Acos button.
        TextView digit = (TextView) findViewById(screen);
        digit.setText("acos" + digit.getText());
        trackeracos++;


    }

    public void atan1(View view) {//Atan button.

        TextView digit = (TextView) findViewById(screen);
        digit.setText("atan" + digit.getText());
        trackeratan++;


    }

    public void dot1(View view) {//Decimal button.

        TextView digit = (TextView) findViewById(screen);
        digit.setText(digit.getText() + ".");

    }

    public void mathlogic() {//Math logic process is done here which is then called when the equals button is pressed.

        try {//Try catch is used to prevent a crash.
         mathlogext();//This is where the method which decided what operations to do is called.
        } catch (Exception e) {
            TextView digit = (TextView) findViewById(screen);
            showToastMessage("SYNTAX ERROR", 570);//Displays syntax error to notify user something is wrong.
            reset();


        }
        screenhelp = 0;
    }

    public void reset() {//This is the reset methode which is used to clear all the button trackers after a calculation.

        trackerlog = 0;
        trackerdot = 0;
        trackerper = 0;
        trackerexp = 0;
        trackersin = 0;
        trackercos = 0;
        trackertan = 0;
        trackerasin = 0;
        trackeracos = 0;
        trackeratan = 0;
        trackernpr = 0;
        trackerncr = 0;
        trackerdiv = 0;
        trackermul = 0;
        trackerroot = 0;
        trackerpi = 0;
        trackerplus = 0;
        trackerroot3 = 0;
        trackerminus = 0;
        trackersinh = 0;
        trackercosh = 0;
    }
    public void mathlogext(){//This is the method where the code decides what mathematical operation to do.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        if ((digit.getText().toString().contains("+") && (trackerplus == 1))) {
            addition();//Calls the addition method.
        } else if ((digit.getText().toString().contains("%") && (trackerper == 1))) {
            mod();//calls the mod method.
        } else if ((digit.getText().toString().contains("-")) && (trackerminus == 1)) {
            subtraction();//Calls the subtraction methode.
        } else if ((digit.getText().toString().contains("÷")) && (trackerdiv == 1)) {
            division();//Calls the division method.
        } else if ((digit.getText().toString().contains("sin")) && (trackersin == 1)) {
            sin();//Calls the sin method.
        } else if ((digit.getText().toString().contains("cos")) && (trackercos == 1)) {
            cos();//Calls the cos method.
        } else if ((digit.getText().toString().contains("tan")) && (trackertan == 1)) {
            tan();//Calls the tan method.
        } else if ((digit.getText().toString().contains("asin")) && (trackerasin == 1)) {
            asin();//Calls the asin method.
        } else if ((digit.getText().toString().contains("acos")) && (trackeracos == 1)) {
            acos();//Calls the acos method.
        } else if ((digit.getText().toString().contains("atan")) && (trackeratan == 1)) {
            atan();//Calls the atan method.
        } else if ((digit.getText().toString().contains("X")) && (trackermul == 1)) {
            multipication();//Calls the multiplication method.
        } else if ((digit.getText().toString().contains("^")) && (trackerexp == 1)) {
            expo();//Calls the exponent method.
        } else if ((digit.getText().toString().contains("Π")) && (trackerpi == 1)) {
            pie();//Calls the pie method.
        } else if ((digit.getText().toString().contains("√")) && (trackerroot == 1)) {
            root();//Calls the root method.
        } else if ((digit.getText().toString().contains("3√")) && (trackerroot3 == 1)) {
            cubroot();//Calls the cubroot method.
        } else if ((digit.getText().toString().contains("cosh")) && (trackercosh == 1)) {
            coshm();//Calls the coshm method.
        } else if ((digit.getText().toString().contains("sinh")) && (trackersinh == 1)) {
            sinhm();//Calls the sinhm method.
        } else if ((digit.getText().toString().contains("tanh")) && (trackertanh == 1)) {
            tanhm();//Calls the tanhm method.
        } else if ((digit.getText().toString().contains("Log")) && (trackerlog == 1)) {
            logm();//calls the logm method.
        }  else if ((digit.getText().toString().contains("N")) && (trackernpr == 1)) {
            nprm();//Calls the nprm method.
        } else if ((digit.getText().toString().contains("N")) && (trackerncr == 1)) {
            ncrm();//Calls the ncrm method.
        } else {
            showToastMessage("SYNTAX ERROR", 570);//Displays syntax error if any calculation goes wrong.
            reset();//Calls the reset methode to reset the button trackers.


        }
    }

    public void showToastMessage(String text, int duration) {//This is the timer method its essentially a countdown timer.
        //This method shows a toast and syntax error on the calculator screen for a timer period.
        final Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
        TextView digit = (TextView) findViewById(screen);

        digit.setText("SYNTAX ERROR");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                TextView digit = (TextView) findViewById(screen);

                toast.cancel();//Ends the toast after a certain time.
                digit.setText("");//Sets the screen back to blank after displaying a syntax error.
            }
        }, duration);
    }

    public double factorial(double solverl) {//Recursive method which calls itself until a number is one which helps solve npr and ncr.
        if (solverl == 1)
            return 1.0;
        else
            return solverl = factorial(solverl - 1) * solverl;//Recursive part (calls itself).
    }

    public double permn(double n, double r) {//This method is specifically used to find npr.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);

            double firstfu = factorial(n);//Top number for npr.
            double secondfu = factorial(n - r);//Bottom number for npr.
        answer=firstfu / secondfu;//Saves to answers.
            digit.setText(Double.toString(firstfu / secondfu));//This divides the top and bottom npr numbers and displays it.
            digit2.setText(" ");
        return (firstfu / secondfu);
    }

    public double Combo(double n, double r) {//This is the method specifically for ncr.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        double ncrt = factorial(n);//Top number for ncr.
        double ncrb = (factorial(r) * factorial(n - r));//Bottom number for ncr.

        answer=ncrt / ncrb;//Saves to answers.
        digit.setText(Double.toString(ncrt / ncrb));//divided top and bottom ncr numbers and displays it
        digit2.setText(" ");
        return ncrt / ncrb;
    }

    public void addition() {//Addition method handles addition logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerplus = 0;
        String plus = digit.getText().toString();
        String addval1 = (plus.substring(plus.lastIndexOf("+") + 1, digit.length()));
        String plus1 = digit.getText().toString();
        String addval2 = (plus.substring(0, plus.lastIndexOf("+")));
        save = Double.parseDouble(addval1);
        save2 = Double.parseDouble(addval2);
        double pluscalc = save + save2;
        answer = pluscalc;//Saves to answers.
        String answerplus = Double.toString(pluscalc);

        digit.setText(answerplus);

    }
    public void mod() {//Mod method handles mod logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerper = 0;
        String mod = digit.getText().toString();
        String mod1 = (mod.substring(mod.lastIndexOf("%") + 1, digit.length()));

        String mod2 = (mod.substring(0, mod.lastIndexOf("%")));
        save = Double.parseDouble(mod2);
        save2 = Double.parseDouble(mod1);
        double modcalc = save % save2;
        answer = modcalc;//Saves to answers.
        String answermod = Double.toString(modcalc);

        digit.setText(answermod);

    }
    public void subtraction() {//Subtraction method handles subtraction logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerminus = 0;
        String minus = digit.getText().toString();
        String subval1 = (minus.substring(minus.lastIndexOf("-") + 1, digit.length()));
        String plus1 = digit.getText().toString();
        String subval2 = (minus.substring(0, minus.lastIndexOf("-")));
        save = Double.parseDouble(subval2);
        save2 = Double.parseDouble(subval1);
        double minuscalc = save - save2;
        String answerminus = Double.toString(minuscalc);
        answer = minuscalc;//Saves to answers.
        digit.setText(answerminus);
    }
    public void multipication() {//Multiplication method handles multiplication logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackermul = 0;
        String timi = digit.getText().toString();
        String tim1 = (timi.substring(timi.lastIndexOf("X") + 1, digit.length()));
        String plus1 = digit.getText().toString();
        String tim2 = (timi.substring(0, timi.lastIndexOf("X")));
        save = Double.parseDouble(tim2);
        save2 = Double.parseDouble(tim1);
        double timscalc = save * save2;
        String answertimes = Double.toString(timscalc);
        answer = timscalc;//Saves to answers.

        digit.setText(answertimes);

    }
    public void division() {//Division method handles division logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerdiv = 0;
        String divi = digit.getText().toString();
        String divval1 = (divi.substring(divi.lastIndexOf("÷") + 1, digit.length()));
        String plus1 = digit.getText().toString();
        String divval2 = (divi.substring(0, divi.lastIndexOf("÷")));
        save = Double.parseDouble(divval2);
        save2 = Double.parseDouble(divval1);
        double divicalc = save / save2;
        String answerdivi = Double.toString(divicalc);
        answer = divicalc;//Saves to answers.
        digit.setText(answerdivi);

    }
    public void sin() {//Sin method handles sin logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackersin = 0;
        String sino = digit.getText().toString();
        String sino1 = (sino.substring(sino.lastIndexOf("s") + 3, digit.length()));

        save2 = Math.toRadians(Double.parseDouble(sino1));
        double sinocalc = (Math.sin(save2));

        answer = sinocalc;//Saves to answers.

        String answersino = Double.toString(sinocalc);

        digit.setText(answersino);

    }
    public void cos() {//Cos method handles cos logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackercos = 0;
        String coso = digit.getText().toString();
        String coso1 = (coso.substring(coso.lastIndexOf("c") + 3, digit.length()));

        save2 = Math.toRadians((Double.parseDouble(coso1)));
        double cosocalc = (Math.cos(save2));

        String answercoso = Double.toString(cosocalc);
        answer = cosocalc;//Saves to answers.
        digit.setText(answercoso);

    }
    public void tan() {//Tan method handles tan logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackertan = 0;
        String tano = digit.getText().toString();
        String tano1 = (tano.substring(tano.lastIndexOf("t") + 3, digit.length()));

        save2 = Math.toRadians((Double.parseDouble(tano1)));
        double tanocalc = (Math.tan(save2));

        String answertano = Double.toString(tanocalc);
        answer = tanocalc;//Saves to answers.
        digit.setText(answertano);


    }
    public void atan() {//Atan method handles atan logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackeratan = 0;
        String tano = digit.getText().toString();
        String tano1 = (tano.substring(tano.lastIndexOf("a") + 4, digit.length()));

        save2 = Math.toRadians((Double.parseDouble(tano1)));
        double tanocalc = (Math.atan(save2));

        String answertano = Double.toString(tanocalc);
        answer = tanocalc;//Saves to answers.
        digit.setText(answertano);

    }
    public void acos() {//Acos method handles acos logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackeracos = 0;
        String coso = digit.getText().toString();
        String coso1 = (coso.substring(coso.lastIndexOf("a") + 4, digit.length()));

        save2 = Math.toRadians((Double.parseDouble(coso1)));
        double cosocalc = (Math.acos(save2));

        String answercoso = Double.toString(cosocalc);
        answer = cosocalc;//Saves to answers.
        digit.setText(answercoso);


    }

    public void asin() {//Asin method handles asin logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerasin = 0;
        String sino = digit.getText().toString();
        String sino1 = (sino.substring(sino.lastIndexOf("a") + 4, digit.length()));

        save2 = Math.toRadians(Double.parseDouble(sino1));
        double sinocalc = (Math.asin(save2));

        answer = sinocalc;//Saves to answers.

        String answersino = Double.toString(sinocalc);

        digit.setText(answersino);


    }
    public void expo() {//Expo method handles exponent logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerexp = 0;
        String expo = digit.getText().toString();
        String expo1 = (expo.substring(expo.lastIndexOf("^") + 1, digit.length()));
        String plus1 = digit.getText().toString();
        String expo2 = (expo.substring(0, expo.lastIndexOf("^")));
        save = Double.parseDouble(expo2);
        save2 = Double.parseDouble(expo1);
        double expocalc = Math.pow(save, save2);
        String answertimes = Double.toString(expocalc);
        digit.setText(answertimes);
        answer = expocalc;//Saves to answers.


    }
    public void pie() {//Pie method handles pi logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerpi = 0;
        String pie = digit.getText().toString();

        String pie2 = (pie.substring(0, pie.lastIndexOf("Π")));
        save = Double.parseDouble(pie2);

        double piecalc = save * 3.14;
        String answertimes = Double.toString(piecalc);
        answer = piecalc;//Saves to answers.
        digit.setText(answertimes);


    }
    public void root() {//Root method handles square root logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerroot = 0;
        String roote = digit.getText().toString();
        String roote1 = (roote.substring(roote.lastIndexOf("√") + 1, digit.length()));

        save = Double.parseDouble(roote1);

        double rootcalc = Math.sqrt(save);
        String answerroot = Double.toString(rootcalc);
        digit.setText(answerroot);
        answer = rootcalc;//Saves to answers.


    }
    public void cubroot() {//Cube root method holds cube root logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerroot3 = 0;
        String roote3 = digit.getText().toString();
        String roote13 = (roote3.substring(roote3.lastIndexOf("√") + 1, digit.length()));

        save = Double.parseDouble(roote13);

        double rootcalc3 = Math.cbrt(save);
        String answerroot3 = Double.toString(rootcalc3);
        digit.setText(answerroot3);
        answer = rootcalc3;//Saves to answers.


    }
    public void coshm() {//Cosh method handles cosh logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackercosh = 0;
        String cosho = digit.getText().toString();
        String cosoh1 = (cosho.substring(cosho.lastIndexOf("c") + 4, digit.length()));

        save2 = Double.parseDouble(cosoh1);
        double cosohcalc = Math.cosh(save2);

        String answercoso = Double.toString(cosohcalc);
        answer = cosohcalc;//Saves to answers.
        digit.setText(answercoso);


    }
    public void sinhm() {//Sinh method handles sinh logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackersinh = 0;
        String sinho = digit.getText().toString();
        String sinh1 = (sinho.substring(sinho.lastIndexOf("s") + 4, digit.length()));

        save2 = Double.parseDouble(sinh1);
        double sinhcalc = Math.sinh(save2);

        String answersinh = Double.toString(sinhcalc);
        answer = sinhcalc;//Saves to answers.
        digit.setText(answersinh);


    }
    public void tanhm() {//Tanh method handles tanh logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackertanh = 0;
        String tanho = digit.getText().toString();
        String tanh1 = (tanho.substring(tanho.lastIndexOf("t") + 4, digit.length()));

        save2 = Double.parseDouble(tanh1);
        double tanhcalc = Math.tanh(save2);

        String answertanh = Double.toString(tanhcalc);
        answer = tanhcalc;//Saves to answers.
        digit.setText(answertanh);


    }
    public void logm() {//Logm method handles log logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerlog = 0;
        String dot = digit.getText().toString();
        String dot1 = (dot.substring(dot.lastIndexOf("Log") + 3, digit.length()));

        save2 = Double.parseDouble(dot1);
        double dotcalc = Math.log(save2);

        String answerdot = Double.toString(dotcalc);
        answer = dotcalc;//Saves to answers.
        digit.setText(answerdot);


    }
    public void nprm() {//Npr method handles npr logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackernpr = 0;
        String screensave = digit.getText().toString();
        double screensaveans = Double.parseDouble((screensave.substring(screensave.lastIndexOf("N") + 2, digit.length())));
        String screensave12 = digit2.getText().toString();
        double screensaveans12 = Double.parseDouble((screensave12.substring(screensave12.lastIndexOf("R") + 2, digit2.length())));


        if (screensaveans >= screensaveans12) {
            permn(screensaveans, screensaveans12);//Calls the npr method which has recursion it is called permn.
        }
        if (screensaveans < screensaveans12) {//If the top of the npr fraction is larger then the bottom it will produce a error.
            showToastMessage("SYNTAX ERROR", 570);
            digit2.setText(" ");
        }


    }
    public void ncrm() {//Ncr method handles npc logic.
        TextView digit = (TextView) findViewById(screen);
        TextView digit2 = (TextView) findViewById(screen2);
        trackerncr = 0;
        String screensave = digit.getText().toString();
        double screensaveans = Double.parseDouble((screensave.substring(screensave.lastIndexOf("N") + 2, digit.length())));
        String screensave12 = digit2.getText().toString();
        double screensaveans12 = Double.parseDouble((screensave12.substring(screensave12.lastIndexOf("R") + 2, digit2.length())));


        if (screensaveans >= screensaveans12) {
            Combo(screensaveans, screensaveans12);//Calls the ncr method which has recursion it is called Combo.
        }
        if (screensaveans < screensaveans12) {//If the top of the ncr fraction is larger then the bottom it will produce a error.
            showToastMessage("SYNTAX ERROR", 570);
            digit2.setText(" ");
        }


    }


}



