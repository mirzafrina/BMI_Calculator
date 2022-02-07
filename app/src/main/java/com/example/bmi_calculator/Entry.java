package com.example.bmi_calculator;

public class Entry {
    private int  ID;
    private double weight;
    private double height;
    private double BMI;

    public Entry(int inputID, double inputWeight, double inputHeight, double inputBMI){
        ID = inputID;
        weight = inputWeight;
        height = inputHeight;
        BMI = inputBMI;
    }

    public int getID() {
        return ID;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI() {
        return BMI;
    }
}