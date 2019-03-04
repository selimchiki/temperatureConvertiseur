package com.selimchiki.temperature;

public class Temperature {

    private double tempInCelsius;
    private double tempInFahrenheit;

    public Temperature(double temp, boolean celsius) {
        if (celsius) {
            this.tempInCelsius = temp;
            this.tempInFahrenheit = ((9.0/5.0) * temp) + 32.0;
        } else {
            this.tempInFahrenheit = temp;
            this.tempInCelsius = ((temp - 32) * 5) / 9;
        }

    }

    public double getTempInCelsius() {
        return tempInCelsius;
    }

    public double getTempInFahrenheit() {
        return tempInFahrenheit;
    }
}
