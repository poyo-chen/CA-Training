package com.tradevan.ca.solid.dip.question;

import lombok.RequiredArgsConstructor;

import java.util.List;

// question: 如何新增一個 CBC 氣像預測功能, 在不異動此程式的情況下完成?
@RequiredArgsConstructor
public class WeatherAggregator {
//    private final AccuweatherApi accuweather;
//    private final BbcWeatherApi bbcWeather;
//    private final CbcWeatherApi cbcWeatherApi;

    private final List<WeatherApi> weatherApis;

    public double getTemperature() {
//        double totalWeather = 0d;
//        for (WeatherApi w :
//                weatherApis) {
//            totalWeather += w.getTemperature();
//        }
//
//        return totalWeather / weatherApis.size();

        return weatherApis.stream().map(WeatherApi::getTemperature
        ).reduce(0d, Double::sum
        )/ weatherApis.size();
    }


//由其他地方處理
//    private double toCelcius(double temperatureFahrenheit) {
//        return (temperatureFahrenheit - 32) / 1.8f;
//    }
}
