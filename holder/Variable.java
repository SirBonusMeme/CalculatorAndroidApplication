//Sajeeth Wimalasuriyan
//January 16, 2018
//Purpose:Make a complex calulator with a graph, history and other complex functions.
//This is part of the gra[hing calculator api i did not make this but i did heavily modify it to get it to work.
//This software is open source and i can legally use and redistribute it.
//This graph is a matter of importing the api in the gradle but it was giving me issues so i just put all the code locally on my app.
package com.swcorp.www.calculator.holder;
import java.util.Hashtable;

public class Variable extends Expr {
    private static Hashtable variables = new Hashtable();


    static public synchronized Variable make(String name) {
        Variable result = (Variable) variables.get(name);
        if (result == null)
            variables.put(name, result = new Variable(name));
        return result;
    }

    private String name;
    private double val;

    /**
     * Create a new variable, with initial value 0.
     * @param name the variable's name
     */
    public Variable(String name) {
        this.name = name; val = 0;
    }

    /** Return the name. */
    public String toString() { return name; }

    /** Get the value.
     * @return the current value */
    public double value() {
        return val;
    }
    /** Set the value.
     * @param value the new value */
    public void setValue(double value) {
        val = value;
    }
}
