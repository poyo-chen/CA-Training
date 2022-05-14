package com.tradevan.ca.solid.dip.question;

public class AccuweatherApi implements WeatherApi {

    private double temperature;

    public double getTemperatureCelcius() {
        // TODO Auto-generated method stub
        return temperature;
    }

    @Override
    public double getTemperature() {
        return getTemperatureCelcius();
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
