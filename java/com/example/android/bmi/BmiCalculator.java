package com.example.android.bmi;

/**
 * Created by Yasser on 15/04/2017.
 */

public class BmiCalculator {
    private double height;
    private double weight;
    private double bmiVal;
    private String bmiResult;

    public void setHeight(double h){
        height=h;
    }
    public void setWeight(double w){
        weight=w;
    }
    public void calcBMI(){
      bmiVal=weight/(height*height);
        bmiResult="";
        if(bmiVal < 18.0) {
            bmiResult = "Underweight";
        }
        else if(bmiVal < 25 && bmiVal >= 18.5) {
            bmiResult = "Normal";

        }
        else if(bmiVal < 30 && bmiVal >= 25) {
            bmiResult = "Overweight";

        }
        else {
            bmiResult = "Obese";
        }
    }

    public double getBmiVal(){
        return bmiVal;
    }

    public String getBmiResult(){
        return bmiResult;
    }
}
