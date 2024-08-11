package com.st.spring;

public class NumberBean{
    private int x;
    private double y;
    public NumberBean(int x, double y){
        this.x = x;
        this.y = y;
    }

    public void setValue(){
        System.out.println("The value of x: " + x + " The value of y: " + y);
    }
    
    public double addValue(){
        double add = x+y;
        return add;
    }
}