package com.tradevan.ca.solid.dip.question;

public class CbcWeatherApi implements WeatherApi {

    private double temperature;

    public double getTemperatureFahrenheit() {
        // TODO Auto-generated method stub
        return CelCiusUtil.toCelcius(temperature);
    }

    @Override
    public double getTemperature() {
        return getTemperatureFahrenheit();
    }
    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}
