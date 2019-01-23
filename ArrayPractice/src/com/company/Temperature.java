package com.company;

public class Temperature {
    private double tempInF;

    public double getTempInF() {
        return tempInF;
    }

    public void setTempInF(double tempInF) {
        this.tempInF = tempInF;
    }

    public double convertToCelcius() {
        double tempInC = (tempInF - 32) * 5/9;
        return tempInC;
    }
}
