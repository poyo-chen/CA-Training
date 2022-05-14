package com.tradevan.ca.solid.dip.test;

import com.tradevan.ca.solid.dip.question.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAggregatorTest {


    WeatherAggregator weatherAggregator;

    private CbcWeatherApi cbcWeatherApi;

    @Test
    void test_get_cbc_temperature() {

        WeatherApi cbcWeatherApi = new CbcWeatherApi();
        List<WeatherApi> list = new ArrayList<>();
        list.add(cbcWeatherApi);
        weatherAggregator = new WeatherAggregator(list);

        //arrange
        cbcWeatherApi.setTemperature(50);
        //act
        Double result = weatherAggregator.getTemperature();
        //assert
        assertEquals(10d, result);
    }


    @Test
    void test_get_all_temperature() {
        WeatherApi accuweatherApi = new AccuweatherApi();
        WeatherApi bbcWeatherApi = new BbcWeatherApi();
        WeatherApi cbcWeatherApi = new CbcWeatherApi();
        List<WeatherApi> list = new ArrayList<>();
        list.add(accuweatherApi);
        list.add(bbcWeatherApi);
        list.add(cbcWeatherApi);
        weatherAggregator = new WeatherAggregator(list);

        //arrange
        accuweatherApi.setTemperature(10);
        bbcWeatherApi.setTemperature(50);
        cbcWeatherApi.setTemperature(50);
        //act
        Double result = weatherAggregator.getTemperature();
        //assert
        assertEquals(10d, result);
    }

    @Test
    void test_get_temperature() {
        WeatherApi accuweatherApi = new AccuweatherApi();
        WeatherApi bbcWeatherApi = new BbcWeatherApi();
        List<WeatherApi> list = new ArrayList<>();
        list.add(accuweatherApi);
        list.add(bbcWeatherApi);
        weatherAggregator = new WeatherAggregator(list);

        //arrange
        accuweatherApi.setTemperature(30);
        bbcWeatherApi.setTemperature(50);
        //act
        Double result = weatherAggregator.getTemperature();
        //assert
        assertEquals(20d, result);
    }

    @Test
    void test_get_temperature_when_zero_should_success() {
        WeatherApi accuweatherApi = new AccuweatherApi();
        WeatherApi bbcWeatherApi = new BbcWeatherApi();
        List<WeatherApi> list = new ArrayList<>();
        list.add(accuweatherApi);
        list.add(bbcWeatherApi);
        weatherAggregator = new WeatherAggregator(list);

        //arrange
        accuweatherApi.setTemperature(0);
        bbcWeatherApi.setTemperature(32);
        //act
        Double result = weatherAggregator.getTemperature();
        //assert
        assertEquals(0d, result);
    }

}